package com.bdaybumps.demo.Models;



import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

public class UserModelDTO {

    private Long Buid;
    private String bfirstName;
    private String blastName;
    private String bemail;
    private String bpassword;
    public UserModelDTO()
    {

    }
    public UserModelDTO(Long uid,String firstName,String lastName,String email,String password)
    {
        this.Buid = uid;
        this.bfirstName= firstName;
        this.blastName = lastName;
        this.bemail = email;
        this.bpassword = password;
    }

    private Timestamp creationDate;

    private Timestamp modifiedDate;
    public Long getUid(){
        return Buid;
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
        this.Buid = uid;
    }


    @Override
    public String toString() {
        return "UserEntity{" +
                "Buid ="+Buid+
                ", firstName='" + bfirstName + '\'' +
                ", lastName='" + blastName + '\'' +
                ", email='" + bemail + '\'' +
                ", password='" + bpassword + '\'' +
                '}';
    }

}
