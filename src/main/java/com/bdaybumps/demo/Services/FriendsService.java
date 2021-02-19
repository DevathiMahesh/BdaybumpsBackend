package com.bdaybumps.demo.Services;

import com.bdaybumps.demo.Domains.FriendsEntity;
import com.bdaybumps.demo.Domains.UserEntity;
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

    public void createFriend(FriendsEntity friendsEntity)
    {
        UserEntity t = userRepository.findByBemail("d.mahesh995@gmail.com");
        List<FriendsEntity> friends = t.getFriends();
        friends.add(friendsEntity);
        System.out.print("Friends..."+friends);
        t.setFriends(friends);
        userRepository.save(t);
    }
}
