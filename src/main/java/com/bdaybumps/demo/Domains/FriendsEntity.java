package com.bdaybumps.demo.Domains;

import javax.persistence.*;

@Entity
@Table(name="friends")
public class FriendsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String fid;


    private String status;

    public String getStatus() {
        return status;
    }



    public void setStatus(String status) {
        this.status = status;
    }



}
