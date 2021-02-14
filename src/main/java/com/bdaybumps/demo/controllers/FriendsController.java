package com.bdaybumps.demo.controllers;

import com.bdaybumps.demo.Domains.FriendsEntity;
import com.bdaybumps.demo.Services.FriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FriendsController {
    @Autowired
    private FriendsService friendsService;
    @PostMapping("/getallfriends/")
    public List<FriendsEntity> getAllFriends(@RequestBody String username)
    {
        return friendsService.getAllFriends(username);
    }
}
