package com.bdaybumps.demo.Models;

import java.util.Date;

public class CreateFriendDTO {

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
                ", dob=" + dob +
                '}';
    }
}
