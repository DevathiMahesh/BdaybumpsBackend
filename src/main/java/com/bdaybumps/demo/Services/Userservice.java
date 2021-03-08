package com.bdaybumps.demo.Services;

import com.bdaybumps.demo.Domains.BuserEntity;

import com.bdaybumps.demo.Models.UserModelDTO;
import com.bdaybumps.demo.Repository.BuserRepository;

import com.bdaybumps.demo.controllers.LoggingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Userservice {
    @Autowired
    private BuserRepository userRepository;
    @Autowired
    private GmailService gmailService;
    Logger logger = LoggerFactory.getLogger(LoggingController.class);
    public  ResponseEntity<BuserEntity> createUser(UserModelDTO user)
    {
        BuserEntity temp = new BuserEntity(


                user.getBfirstName(),
                user.getBlastName(),
                user.getBemail(),
                user.getBpassword()


        );
        System.out.println(user);
//        gmailService.sendEmail(user.getFirstName());
        logger.info("New User Created.An Email is sent.");
        return new ResponseEntity<>(userRepository.save(temp), HttpStatus.CREATED);
    }
    public List<BuserEntity> getAllUsers()
    {
        List<BuserEntity> li = userRepository.findAll();
        return  li;
    }
    public BuserEntity findUserByEmail(String email)
    {
        return userRepository.findByBemail(email);
    }
}
