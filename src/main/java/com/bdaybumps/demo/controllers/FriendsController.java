package com.bdaybumps.demo.controllers;

import com.bdaybumps.demo.Domains.FriendsEntity;
import com.bdaybumps.demo.Domains.UserEntity;
import com.bdaybumps.demo.Models.CreateFriendDTO;
import com.bdaybumps.demo.Repository.FriendsRepository;
import com.bdaybumps.demo.Repository.UserRepository;
import com.bdaybumps.demo.Services.FriendsService;
import kafka.security.auth.Create;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
        return friendsService.createFriend(createFriendDTO);
    }

}
