package com.bdaybumps.demo.Models;

public class CreateFriendDTO {
    private Long buid;
    private String fname;
    private String fphone;
    private String femail;

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setBuid(Long buid) {
        this.buid = buid;
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

    public Long getBuid() {
        return buid;
    }

    public String getFemail() {
        return femail;
    }

    public String getFphone() {
        return fphone;
    }
}
