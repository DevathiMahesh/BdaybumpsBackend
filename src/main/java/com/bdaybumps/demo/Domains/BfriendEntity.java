package com.bdaybumps.demo.Domains;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Value;

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
    private Boolean bestie;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="bfriend_id",referencedColumnName = "buid")
    @JsonBackReference
    private BuserEntity user1;
    public BfriendEntity()
    {

    }

    public BfriendEntity(String fname,String femail,String fphone,Date fdob,Boolean bestie)
    {
        this.fname = fname;
        this.femail = femail;
        this.fphone = fphone;
        this.fdob = fdob;
        this.bestie = bestie;
    }

    public void setBestie(Boolean bestie) {
        this.bestie = bestie;
    }

    public void setFphone(String fphone) {
        this.fphone = fphone;
    }

    public void setFemail(String femail) {
        this.femail = femail;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public void setFdob(Date fdob) {
        this.fdob = fdob;
    }

    public void setUser1(BuserEntity user1) {
        this.user1 = user1;
    }

    public BuserEntity getUser1() {
        return user1;
    }

    public Boolean getBestie() {
        return bestie;
    }

    public String getFphone() {
        return fphone;
    }

    public String getFemail() {
        return femail;
    }

    public String getFname() {
        return fname;
    }

    public Date getFdob() {
        return fdob;
    }

    public Long getFid() {
        return fid;
    }

    @Override
    public String toString() {
        return "BfriendEntity{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                ", femail='" + femail + '\'' +
                ", fphone='" + fphone + '\'' +
                ", fdob=" + fdob +
                ", bestie=" + bestie +
                ", user1=" + user1 +
                '}';
    }
}
