package com.bdaybumps.demo.Services;

import com.bdaybumps.demo.Domains.BfriendEntity;
import com.bdaybumps.demo.Domains.BuserEntity;
import com.bdaybumps.demo.Models.CreateFriendDTO;
import com.bdaybumps.demo.Repository.BfriendsRepository;
import com.bdaybumps.demo.Repository.BuserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.ArrayList;
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
        f.setFphone(createFriendDTO.getFphone());
        f.setFdob(createFriendDTO.getFdob());
        f.setFemail(createFriendDTO.getFemail());
        f.setBestie(createFriendDTO.getBestie());
        friendsRepository.save(f);

        BuserEntity t = userRepository.findByBemail("d.mahesh995@gmail.com");
        List<BfriendEntity> friends = t.getBfriends();
        friends.add(f);
        t.setBfriends(friends);
        userRepository.save(t);
        return "Friend Created Successfully";
    }
    public List<BfriendEntity> getFriendsById(Long buid)
    {
        BuserEntity buser =  userRepository.findByBuid(buid);
        System.out.println(buser.getBfriends());
        return buser.getBfriends();
    }
    public List<BfriendEntity> getBestieById(Long buid)
    {
        BuserEntity buser = userRepository.findByBuid(buid);
        List<BfriendEntity> friends = buser.getBfriends();
        List<BfriendEntity> besties = new ArrayList<>();
        for(BfriendEntity b:friends)
        {
            if(b.getBestie()==true)
            {
                besties.add(b);
            }
        }
        return besties;
    }
    public String deleteFriend(BfriendEntity friend){
         friendsRepository.delete(friend);
         return "Friend Deleted Successfully";
    }
}
