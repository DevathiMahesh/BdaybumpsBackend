package com.bdaybumps.demo.Domains;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name="FriendsEntity")
@Table(name="bfriends")
public class FriendsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fid;


    private String fname;
    private String femail;
    private String fphone;

    @ManyToOne
    @JoinColumn(name="buserid",referencedColumnName = "Buid")
    private UserEntity userEntity;
    public FriendsEntity()
    {

    }
    public FriendsEntity(String fname,String femail,String fphone)
    {
        this.fname = fname;
        this.femail = femail;
        this.fphone = fphone;
    }
    public Long getFid() {
        return fid;
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

    public void setEmail(String femail) {
        this.femail = femail;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setPhone(String fphone) {
        this.fphone = fphone;
    }
}
