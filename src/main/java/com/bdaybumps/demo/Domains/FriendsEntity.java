package com.bdaybumps.demo.Domains;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="friends")
public class FriendsEntity {

    private String uid1;

    private String uid2;
    private String status;

    public String getStatus() {
        return status;
    }

    public String getUid1() {
        return uid1;
    }

    public String getUid2() {
        return uid2;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUid1(String uid1) {
        this.uid1 = uid1;
    }

    public void setUid2(String uid2) {
        this.uid2 = uid2;
    }

    @Override
    public String toString() {
        return "FriendsEntity{" +
                "uid1='" + uid1 + '\'' +
                ", uid2='" + uid2 + '\'' +
                '}';
    }
}
