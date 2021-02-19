package com.bdaybumps.demo;

import com.bdaybumps.demo.Domains.NotifyEntity;
import com.bdaybumps.demo.Domains.UserEntity;
import com.bdaybumps.demo.Repository.NotifyRepository;
import com.bdaybumps.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
public class BdaybumpsBackendApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private NotifyRepository notifyRepository;
	public static void main(String[] args) {
		SpringApplication.run(BdaybumpsBackendApplication.class, args);
	}
   @Override
	public void run(String... arg0) throws Exception {

	   NotifyEntity n1 = new NotifyEntity();
	   n1.setNtitle("t1");
	   n1.setNdescription("d1");
	   NotifyEntity n2 = new NotifyEntity();
	   n2.setNtitle("t1");
	   n2.setNdescription("d1");
	   UserEntity u1 = userRepository.findByBemail("d.mahesh995@gmail.com");
       List li = new ArrayList<>();
       li.add(n1);
       li.add(n2);
       u1.setNotifications(li);
       notifyRepository.save(n1);
       notifyRepository.save(n2);
       userRepository.save(u1);
       System.out.println(userRepository.findAll());
       System.out.println(notifyRepository.findAll());
	}
}
