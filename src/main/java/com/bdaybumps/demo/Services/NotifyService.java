package com.bdaybumps.demo.Services;

import com.bdaybumps.demo.Domains.BuserEntity;
import com.bdaybumps.demo.Domains.NotifyEntity;

import com.bdaybumps.demo.Models.NotifyDTO;
import com.bdaybumps.demo.Repository.BuserRepository;
import com.bdaybumps.demo.Repository.NotifyRepository;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotifyService {
    @Autowired
    private NotifyRepository notifyRepository;
    @Autowired
    private BuserRepository userRepository;
    public String createNotification(NotifyDTO notifyDTO)
    {
        NotifyEntity n = new NotifyEntity();
        n.setNtitle(notifyDTO.getNtitle());
        n.setNdescription(notifyDTO.getNdescription());
        notifyRepository.save(n);
        BuserEntity u = userRepository.findByBemail("d.mahesh995@gmail.com");
        List<NotifyEntity> nlist = u.getNotifications();
        nlist.add(n);
        u.setNotifications(nlist);
        userRepository.save(u);
        return "Notification added successfully";
    }
    public List<NotifyEntity> getNotifications()
    {
        return notifyRepository.findAll();
    }
}
