package com.bdaybumps.demo.controllers;

import com.bdaybumps.demo.Domains.NotifyEntity;
import com.bdaybumps.demo.Models.NotifyDTO;
import com.bdaybumps.demo.Services.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotifyController {
    @Autowired
    private NotifyService notifyService;
    @PostMapping("/createNotification")
    public String createNotification(@RequestBody NotifyDTO notifyDTO)
    {
        return notifyService.createNotification(notifyDTO);
    }
    @GetMapping("/getNotifications")
    public List<NotifyEntity> getNotifications()
    {
        return notifyService.getNotifications();
    }
}
