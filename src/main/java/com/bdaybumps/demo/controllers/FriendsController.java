package com.bdaybumps.demo.controllers;

import com.bdaybumps.demo.Domains.BfriendEntity;
import com.bdaybumps.demo.Models.CreateFriendDTO;
import com.bdaybumps.demo.Repository.BfriendsRepository;
import com.bdaybumps.demo.Services.BFriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        System.out.print(createFriendDTO);
        return friendsService.createFriend(createFriendDTO);
    }
    @GetMapping("/getFriendById/{buid}")
    public List<BfriendEntity> getFriendById(@PathVariable("buid") String buid)
    {
        System.out.println(buid+""+buid.getClass().getName());
        return friendsService.getFriendsById(Long.parseLong(buid));
    }
}
