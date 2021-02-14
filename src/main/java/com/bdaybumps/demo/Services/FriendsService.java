package com.bdaybumps.demo.Services;

import com.bdaybumps.demo.Domains.FriendsEntity;
import com.bdaybumps.demo.Repository.FriendsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendsService {
    @Autowired
    private FriendsRepository friendsRepository;
    public List<FriendsEntity> getAllFriends(String username)
    {
         return friendsRepository.findAll();
    }
}
