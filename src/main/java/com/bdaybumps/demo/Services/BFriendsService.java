package com.bdaybumps.demo.Services;

import com.bdaybumps.demo.Domains.BfriendEntity;
import com.bdaybumps.demo.Domains.BuserEntity;
import com.bdaybumps.demo.Models.CreateFriendDTO;
import com.bdaybumps.demo.Repository.BfriendsRepository;
import com.bdaybumps.demo.Repository.BuserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BFriendsService {
    @Autowired
    private BfriendsRepository friendsRepository;
    @Autowired
    private BuserRepository userRepository;
    public List<BfriendEntity> getAllFriends()
    {
        return friendsRepository.findAll();
    }

    public String createFriend(CreateFriendDTO createFriendDTO)
    {
        BfriendEntity f = new BfriendEntity();
        f.setFname(createFriendDTO.getFname());
        f.setFPhone(createFriendDTO.getFphone());
        f.setDob(createFriendDTO.getDob());
        f.setEmail(createFriendDTO.getFemail());
        friendsRepository.save(f);

        BuserEntity t = userRepository.findByBemail("d.mahesh995@gmail.com");
        List<BfriendEntity> friends = t.getBfriends();
        friends.add(f);
        t.setBfriends(friends);
        userRepository.save(t);
        return "Friend Created Successfully";
    }
}