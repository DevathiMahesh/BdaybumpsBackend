package com.bdaybumps.demo.Services;

import com.bdaybumps.demo.Domains.FriendsEntity;
import com.bdaybumps.demo.Domains.UserEntity;
import com.bdaybumps.demo.Models.CreateFriendDTO;
import com.bdaybumps.demo.Repository.FriendsRepository;
import com.bdaybumps.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FriendsService {
    @Autowired
    private FriendsRepository friendsRepository;
    @Autowired
    private UserRepository userRepository;
    public List<FriendsEntity> getAllFriends(String username)
    {
         return friendsRepository.findAll();
    }

    public String createFriend(CreateFriendDTO createFriendDTO)
    {
        FriendsEntity f = new FriendsEntity();
        f.setFname(createFriendDTO.getFname());
        f.setPhone(createFriendDTO.getFphone());
        f.setDob(createFriendDTO.getDob());
        f.setEmail(createFriendDTO.getFemail());
        friendsRepository.save(f);

        UserEntity t = userRepository.findByBemail("d.mahesh995@gmail.com");
        List<FriendsEntity> friends = t.getFriends();
        friends.add(f);
        t.setFriends(friends);
        userRepository.save(t);
        return "Friend Created Successfully";
    }
}
