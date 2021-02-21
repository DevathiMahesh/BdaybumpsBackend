package com.bdaybumps.demo.Services;

import com.bdaybumps.demo.Domains.BfriendEntity;
import com.bdaybumps.demo.Domains.BuserEntity;
;
import com.bdaybumps.demo.Repository.BuserRepository;

import com.bdaybumps.demo.controllers.FriendsController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class BdayTimelineService {
    @Autowired
    private BuserRepository userRepository;
    @Autowired
    private JavaMailSender javaMailSender;
    private List<String> todayBstars = new ArrayList();
    private Map<String,List<BfriendEntity>> response = new HashMap<String,List<BfriendEntity>>();
    public Date d = new Date();
    SimpleDateFormat formatNowDay = new SimpleDateFormat("dd");
    SimpleDateFormat formatNowMonth = new SimpleDateFormat("MM");
    String currentDay = formatNowDay.format(d);
    String currentMonth = formatNowMonth.format(d);
    public void getTodayStars(List<BfriendEntity> li)
    {
         List todaystars = new ArrayList();
          for(BfriendEntity b:li)
          {
               String temp = b.getFdob().toString().split(" ")[0];
               String day = temp.split("-")[2];
               String month = temp.split("-")[1];
               System.out.print(formatNowDay.format(d)+" "+formatNowMonth.format(d));

              if(currentMonth.equals(month) && currentDay.equals(day))
              {
                  todaystars.add(b);
                  todayBstars.add(b.getFname());
              }
          }
          response.put("day",todaystars);
    }
    public void getWeekStars(List<BfriendEntity> li)
    {
        List weekstars = new ArrayList();
        for(BfriendEntity b:li)
        {
            String temp = b.getFdob().toString().split(" ")[0];
            int diff = Integer.parseInt(temp.split("-")[2])-Integer.parseInt(currentDay);
            String month = temp.split("-")[1];
            System.out.print(formatNowDay.format(d)+" "+formatNowMonth.format(d));

            if(currentMonth.equals(month) && diff>0)
            {
                weekstars.add(b);
            }
        }
        response.put("week",weekstars);
    }
    public void getMonthStars(List<BfriendEntity> li)
    {
        List monthstars = new ArrayList();
        for(BfriendEntity b:li)
        {
            String temp = b.getFdob().toString().split(" ")[0];
            String day = temp.split("-")[2];
            String month = temp.split("-")[1];
            System.out.print(formatNowDay.format(d)+" "+formatNowMonth.format(d));

            if(currentMonth.equals(month) && currentDay.compareTo(day)<0)
            {
                monthstars.add(b);
            }
        }
        response.put("month",monthstars);
    }
    public Map<String,List<BfriendEntity>> getBdayTimeline(Long buid)
    {
        BuserEntity u = userRepository.findByBuid(buid);
        List<BfriendEntity> li = u.getBfriends();
        this.getTodayStars(li);
        this.getMonthStars(li);
        this.getWeekStars(li);
        return this.response;
    }
    @Scheduled(cron = " 0 58 9 * * *")
    public void sendRemainder()
    {

            List<BuserEntity> u = userRepository.findAll();
            for(BuserEntity buser:u) {
                List<BfriendEntity> li = buser.getBfriends();
                this.getTodayStars(li);
                for(String friend:todayBstars) {
                    SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
                    simpleMailMessage.setFrom("noreply@bdaybumps.com");
                    simpleMailMessage.setSubject(friend + " is your Bday Star today.");
                    simpleMailMessage.setText("Its " + friend + "'s Bday today...Wish him for great years ahead.");
                    simpleMailMessage.setTo("d.mahesh995@gmail.com");
                    javaMailSender.send(simpleMailMessage);
                }
            }
    }
}
