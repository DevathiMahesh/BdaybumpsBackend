package com.bdaybumps.demo.Services;

import com.bdaybumps.demo.Domains.BuserEntity;

import com.bdaybumps.demo.Repository.BuserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private BuserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        BuserEntity u = userRepository.findByBemail(s);
        return new User(u.getBemail(),u.getBpassword(),new ArrayList<>());
    }
}
