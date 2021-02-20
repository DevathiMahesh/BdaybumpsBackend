package com.bdaybumps.demo.Domains;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bfriends")
public class BfriendEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fid;


    private String fname;
    private String femail;
    private String fphone;
    private Date fdob;
    @ManyToOne
    @JoinColumn(name="bfriend_id",referencedColumnName = "Buid")
    @JsonBackReference
    private BuserEntity user1;
    public BfriendEntity()
    {

    }

    public BfriendEntity(String fname,String femail,String fphone,Date fdob)
    {
        this.fname = fname;
        this.femail = femail;
        this.fphone = fphone;
        this.fdob = fdob;
    }

    public void setUserEntity(BuserEntity user1) {
        this.user1 = user1;
    }

    public BuserEntity getUserEntity() {
        return user1;
    }

    public Long getFid() {
        return fid;
    }

    public Date getDob() {
        return fdob;
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
        this.fdob = dob;
    }

    public void setEmail(String femail) {
        this.femail = femail;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setFPhone(String fphone) {
        this.fphone = fphone;
    }

    @Override
    public String toString() {
        return "FriendsEntity{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                ", femail='" + femail + '\'' +
                ", fphone='" + fphone + '\'' +
                ", fdob=" + fdob +
                ", userEntity=" + user1 +
                '}';
    }
}
