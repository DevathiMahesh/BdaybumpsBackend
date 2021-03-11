package com.bdaybumps.demo.controllers;

import com.bdaybumps.demo.Domains.AuthRequest;
import com.bdaybumps.demo.Domains.AuthResponse;
import com.bdaybumps.demo.Domains.BuserEntity;

import com.bdaybumps.demo.JwtUtil;
import com.bdaybumps.demo.Models.UserModelDTO;
import com.bdaybumps.demo.Services.GmailService;
import com.bdaybumps.demo.Services.MyUserDetailsService;
import com.bdaybumps.demo.Services.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Multipart;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HomeController {
    @Autowired
    private Userservice userservice;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private MyUserDetailsService myUserDetailsService;
    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/")
    public String home(){
        return "Welcome Mahesh!";
    }
    @RequestMapping(method = RequestMethod.POST,path = {"/createuser"},consumes = { "multipart/form-data" })
    public ResponseEntity<?> createUser(@RequestPart("user") UserModelDTO temp,@RequestPart("profilepic") MultipartFile file) throws IOException {

        System.out.println("In Home controller"+temp);
        return userservice.createUser(temp,file);
    }
    @GetMapping("/allusers")
    public List<BuserEntity> getAllUsers()
    {
        return userservice.getAllUsers();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthRequest temp) throws Exception {
       try{
           authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(temp.getUsername(),temp.getPassword()));
       }catch(Exception e){
          throw new Exception("Invalid username or password.");
       }
       final UserDetails userDetails = myUserDetailsService.loadUserByUsername(temp.getUsername());
       final String jwt = jwtUtil.generateToken(userDetails);
       AuthResponse ar = new AuthResponse(jwt);
       BuserEntity b = userservice.findUserByEmail(temp.getUsername());
       Map<String,Object> m = new HashMap<String,Object>();
       m.put("jwt",ar);
       m.put("userdetails",b);
       return  ResponseEntity.ok(m);
    }
}
