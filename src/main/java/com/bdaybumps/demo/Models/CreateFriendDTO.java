package com.bdaybumps.demo.Models;

import org.apache.kafka.common.protocol.types.Field;

import java.util.Date;

public class CreateFriendDTO {

    private String fname;
    private String fphone;
    private String femail;
    private Date fdob;
    private Boolean bestie;
    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setDob(Date fdob) {
        this.fdob = fdob;
    }

    public void setBestie(Boolean bestie) {
        this.bestie = bestie;
    }

    public Boolean getBestie() {
        return bestie;
    }

    public void setFemail(String femail) {
        this.femail = femail;
    }

    public void setFphone(String fphone) {
        this.fphone = fphone;
    }

    public String getFname() {
        return fname;
    }

    public Date getFdob() {
        return fdob;
    }



    public String getFemail() {
        return femail;
    }

    public String getFphone() {
        return fphone;
    }

    @Override
    public String toString() {
        return "CreateFriendDTO{" +

                ", fname='" + fname + '\'' +
                ", fphone='" + fphone + '\'' +
                ", femail='" + femail + '\'' +
                ", fdob=" + fdob +
                '}';
    }
}
