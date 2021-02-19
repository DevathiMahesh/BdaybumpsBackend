package com.bdaybumps.demo.controllers;

import com.bdaybumps.demo.Models.NotificationDTO;
import com.bdaybumps.demo.Repository.NotificationRepository;
import com.bdaybumps.demo.Services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NotificationsController {
        @Autowired
        private NotificationService notificationService;
      @GetMapping("/getNotifications/{Buid}")
      public List getNotifications(@PathVariable("Buid") String Buid)
      {
           return new ArrayList();
      }
      @PostMapping("/createNotification")
      public String createNotification(NotificationDTO notification)
      {
           return notificationService.createNotification(notification);
      }

}
