package com.bdaybumps.demo.controllers;

import com.bdaybumps.demo.Domains.BfriendEntity;
import com.bdaybumps.demo.Models.CreateFriendDTO;
import com.bdaybumps.demo.Repository.BfriendsRepository;
import com.bdaybumps.demo.Services.BFriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FriendsController {
    @Autowired
    private BFriendsService friendsService;
    @Autowired
    private BfriendsRepository friendsRepository;

    @GetMapping("/getallfriends")
    public List<BfriendEntity> getAllFriends()
    {
        return friendsService.getAllFriends();
    }
    @PostMapping("/createfriend")
    public String createFriend(@RequestBody CreateFriendDTO createFriendDTO)
    {
        return friendsService.createFriend(createFriendDTO);
    }

}
