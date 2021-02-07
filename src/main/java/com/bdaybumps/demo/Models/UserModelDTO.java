package com.bdaybumps.demo.Models;



import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

public class UserModelDTO {

    private String Uid;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    public UserModelDTO()
    {

    }
    public UserModelDTO(String firstName,String lastName,String email,String password)
    {
        this.firstName= firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    private Timestamp creationDate;

    private Timestamp modifiedDate;
    public String getUid(){
        return Uid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUid(String uid) {
        Uid = uid;
    }


    @Override
    public String toString() {
        return "UserEntity{" +
                "Uid='" + Uid + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
