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

import java.util.List;

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
    @PostMapping("/createuser")
    public ResponseEntity<BuserEntity> createUser(@RequestBody  UserModelDTO temp)
    {

        System.out.println("In Home controller"+temp);
        return userservice.createUser(temp);
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

       return  ResponseEntity.ok(new AuthResponse(jwt));
    }
}
