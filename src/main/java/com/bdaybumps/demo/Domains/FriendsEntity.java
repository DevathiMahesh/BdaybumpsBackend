package com.bdaybumps.demo.Domains;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity(name="FriendsEntity")
@Table(name="bfriends")
public class FriendsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fid;


    private String fname;
    private String femail;
    private String fphone;
    private Date dob;
    @ManyToOne
    @JoinColumn(name="buserid",referencedColumnName = "Buid")
    @JsonBackReference
    private UserEntity user1;
    public FriendsEntity()
    {

    }

    public FriendsEntity(String fname,String femail,String fphone,Date dob)
    {
        this.fname = fname;
        this.femail = femail;
        this.fphone = fphone;
        this.dob = dob;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.user1 = userEntity;
    }

    public UserEntity getUserEntity() {
        return user1;
    }

    public Long getFid() {
        return fid;
    }

    public Date getDob() {
        return dob;
    }

    public String getEmail() {
        return femail;
    }

    public String getFname() {
        return fname;
    }

    public String getPhone() {
        return fphone;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setEmail(String femail) {
        this.femail = femail;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setPhone(String fphone) {
        this.fphone = fphone;
    }

    @Override
    public String toString() {
        return "FriendsEntity{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                ", femail='" + femail + '\'' +
                ", fphone='" + fphone + '\'' +
                ", dob=" + dob +
                ", userEntity=" + user1 +
                '}';
    }
}
