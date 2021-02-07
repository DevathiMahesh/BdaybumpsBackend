package com.bdaybumps.demo.controllers;

import com.bdaybumps.demo.Domains.UserEntity;
import com.bdaybumps.demo.Models.UserModelDTO;
import com.bdaybumps.demo.Services.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private Userservice userservice;
    @GetMapping("/")
    public String home(){
        return "Welcome Mahesh!";
    }
    @PostMapping("/createuser")
    public ResponseEntity<UserEntity> createUser(@RequestBody  UserModelDTO user)
    {

        System.out.println("In Home controller"+user);
        return userservice.createUser(user);
    }
    @GetMapping("/allusers")
    public List<UserEntity> getAllUsers()
    {
        return userservice.getAllUsers();
    }
}
