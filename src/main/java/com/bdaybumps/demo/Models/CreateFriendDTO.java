package com.bdaybumps.demo.Models;

import java.util.Date;

public class CreateFriendDTO {
    private Long Buid;
    private String fname;
    private String fphone;
    private String femail;
    private Date dob;
    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setBuid(Long buid) {
        this.Buid = buid;
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

    public Date getDob() {
        return dob;
    }

    public Long getBuid() {
        return Buid;
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
                "Buid=" + Buid +
                ", fname='" + fname + '\'' +
                ", fphone='" + fphone + '\'' +
                ", femail='" + femail + '\'' +
                ", dob=" + dob +
                '}';
    }
}
