package com.bdaybumps.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class GmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    String title = "Greetings from Bdaybumps Community....";
    String body = ", Your Registration is Successful.You can login now to Bdaybumps.com ";
    public void sendEmail(String username)
    {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("noreply@bdaybumps.com");
        simpleMailMessage.setSubject(title);
        simpleMailMessage.setText("Hi "+username+""+body);
//        simpleMailMessage.setText("With Best Regards, Bdaybumps Team.");
        simpleMailMessage.setTo("d.mahesh995@gmail.com");
        javaMailSender.send(simpleMailMessage);
    }
    @Scheduled(fixedRate = 100000)
    public void sendRemainder()
    {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("noreply@bdaybumps.com");
        simpleMailMessage.setSubject("Bday Stars of the Day");
        simpleMailMessage.setText("Its Harsha's Bday today...Wish him for great years ahead.");
        simpleMailMessage.setTo("d.mahesh995@gmail.com");
        javaMailSender.send(simpleMailMessage);
    }
}
