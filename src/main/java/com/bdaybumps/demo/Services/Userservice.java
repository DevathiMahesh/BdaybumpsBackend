package com.bdaybumps.demo.Services;

import com.bdaybumps.demo.Domains.UserEntity;
import com.bdaybumps.demo.Models.UserModelDTO;
import com.bdaybumps.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
    @Autowired
    private UserRepository userRepository;
    public  ResponseEntity<UserEntity> createUser(UserModelDTO user)
    {
        UserEntity userEntity = new UserEntity(

                user.getEmail(),
                user.getFirstName(),
                user.getLastName(),
                user.getPassword()

        );
        return new ResponseEntity<>(userRepository.save(userEntity), HttpStatus.CREATED);
    }

}
