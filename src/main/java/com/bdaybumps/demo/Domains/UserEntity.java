package com.bdaybumps.demo.Domains;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Buser")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Uid;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp creationDate;
    @UpdateTimestamp
    private Timestamp modifiedDate;
    @OneToMany(targetEntity = FriendsEntity.class,mappedBy = "userEntity",cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    private List<FriendsEntity> friends = new ArrayList<>();

    public UserEntity()
    {

    }
    public UserEntity(String firstName,String lastName,String email,String password)
    {
        this.firstName= firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public List<FriendsEntity> getFriends() {
        return friends;
    }

    public void setFriends(List<FriendsEntity> friends) {
        this.friends = friends;
    }

    public Long getUid(){
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

    public void setUid(Long uid) {
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
