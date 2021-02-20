package com.bdaybumps.demo.Services;

import com.bdaybumps.demo.Domains.FriendsEntity;
import com.bdaybumps.demo.Domains.NotifyEntity;
import com.bdaybumps.demo.Domains.UserEntity;
import com.bdaybumps.demo.Repository.UserRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BdayTimelineService {
    @Autowired
    private UserRepository userRepository;
    private List todaystars = new ArrayList();
    private List weekstars = new ArrayList();
    private List monthstars = new ArrayList();
    private Map<String,List<FriendsEntity>> response = new HashMap<String,List<FriendsEntity>>();
    public Date d = new Date();
    public void getTodayStars(List<FriendsEntity> li)
    {
          response.put("day",li);
    }
    public void getWeekStars(List<FriendsEntity> li)
    {

    }
    public void getMonthStars(List<FriendsEntity> li)
    {

    }
    public Map<String,List<FriendsEntity>> getBdayTimeline(Long buid)
    {
        UserEntity u = userRepository.findByBuid(buid);
        List<FriendsEntity> li = u.getFriends();
        this.getTodayStars(li);
        return this.response;

//        return  "Bday Timeline service hitting";
//        return ResponseEntity.ok();
    }
}
