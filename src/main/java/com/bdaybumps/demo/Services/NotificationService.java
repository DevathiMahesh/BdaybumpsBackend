package com.bdaybumps.demo.Services;

import com.bdaybumps.demo.Domains.NotificationEntity;
import com.bdaybumps.demo.Models.NotificationDTO;
import com.bdaybumps.demo.Repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
       @Autowired
       private NotificationRepository notificationRepository;

       public String createNotification(NotificationDTO notification)
       {
           NotificationEntity n = new NotificationEntity();
           n.setTitle(notification.getTitle());
           n.setDescription(notification.getDescription());
           notificationRepository.save(n);
           return "Notification added successfully";
       }

}
