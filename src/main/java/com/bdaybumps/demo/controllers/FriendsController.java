package com.bdaybumps.demo.controllers;

import com.bdaybumps.demo.Domains.FriendsEntity;
import com.bdaybumps.demo.Models.CreateFriendDTO;
import com.bdaybumps.demo.Repository.FriendsRepository;
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
    @Autowired
    private FriendsRepository friendsRepository;
    @PostMapping("/getallfriends/")
    public List<FriendsEntity> getAllFriends(@RequestBody String username)
    {
        return friendsService.getAllFriends(username);
    }
    @PostMapping("/createfriend")
    public String createFriend(@RequestBody CreateFriendDTO createFriendDTO)
    {
        FriendsEntity f = new FriendsEntity(createFriendDTO.getFname(),createFriendDTO.getFemail(),createFriendDTO.getFphone());
        friendsRepository.save(f);

        return "Friend added successfully";
    }

}
