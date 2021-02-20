package com.bdaybumps.demo.Services;

import com.bdaybumps.demo.Domains.BfriendEntity;
import com.bdaybumps.demo.Domains.BuserEntity;
;
import com.bdaybumps.demo.Repository.BuserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BdayTimelineService {
    @Autowired
    private BuserRepository userRepository;
    private List todaystars = new ArrayList();
    private List weekstars = new ArrayList();
    private List monthstars = new ArrayList();
    private Map<String,List<BfriendEntity>> response = new HashMap<String,List<BfriendEntity>>();
    public Date d = new Date();
    public void getTodayStars(List<BfriendEntity> li)
    {
          response.put("day",li);
    }
    public void getWeekStars(List<BfriendEntity> li)
    {

    }
    public void getMonthStars(List<BfriendEntity> li)
    {

    }
    public Map<String,List<BfriendEntity>> getBdayTimeline(Long buid)
    {
        BuserEntity u = userRepository.findByBuid(buid);
        List<BfriendEntity> li = u.getBfriends();
        this.getTodayStars(li);
        return this.response;

//        return  "Bday Timeline service hitting";
//        return ResponseEntity.ok();
    }
}
