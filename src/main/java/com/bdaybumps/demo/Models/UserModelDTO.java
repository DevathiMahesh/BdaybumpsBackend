package com.bdaybumps.demo.Models;



import com.bdaybumps.demo.Domains.FriendsEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.List;

public class UserModelDTO {

    private Long buid;
    private String bfirstName;
    private String blastName;
    private String bemail;
    private String bpassword;
    private List<FriendsEntity> friendsList;
    public UserModelDTO()
    {

    }
    public UserModelDTO(Long uid,String firstName,String lastName,String email,String password,List<FriendsEntity> friendsList)
    {
        this.buid = uid;
        this.bfirstName= firstName;
        this.blastName = lastName;
        this.bemail = email;
        this.bpassword = password;
        this.friendsList = friendsList;
    }

    private Timestamp creationDate;

    private Timestamp modifiedDate;
    public Long getUid(){
        return buid;
    }

    public String getFirstName() {
        return bfirstName;
    }

    public String getEmail() {
        return bemail;
    }

    public String getLastName() {
        return blastName;
    }

    public String getPassword() {
        return bpassword;
    }

    public List<FriendsEntity> getFriendsList() {
        return friendsList;
    }

    public void setEmail(String email) {
        this.bemail = email;
    }

    public void setFirstName(String firstName) {
        this.bfirstName = firstName;
    }

    public void setLastName(String lastName) {
        this.blastName = lastName;
    }

    public void setPassword(String password) {
        this.bpassword = password;
    }

    public void setUid(Long uid) {
        this.buid = uid;
    }

    public void setFriendsList(List<FriendsEntity> friendsList) {
        this.friendsList = friendsList;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "Buid ="+buid+
                ", firstName='" + bfirstName + '\'' +
                ", lastName='" + blastName + '\'' +
                ", email='" + bemail + '\'' +
                ", password='" + bpassword + '\'' +
                '}';
    }

}
