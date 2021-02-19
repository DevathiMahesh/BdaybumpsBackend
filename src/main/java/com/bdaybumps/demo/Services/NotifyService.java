package com.bdaybumps.demo.Services;

import com.bdaybumps.demo.Domains.NotifyEntity;
import com.bdaybumps.demo.Models.NotifyDTO;
import com.bdaybumps.demo.Repository.NotifyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotifyService {
    @Autowired
    private NotifyRepository notifyRepository;
    public String createNotification(NotifyDTO notifyDTO)
    {
        NotifyEntity n = new NotifyEntity();
        n.setNtitle(notifyDTO.getNtitle());
        n.setNdescription(notifyDTO.getNdescription());
        notifyRepository.save(n);
        return "Notification added successfully";
    }
    public List<NotifyEntity> getNotifications()
    {
        return notifyRepository.findAll();
    }
}
