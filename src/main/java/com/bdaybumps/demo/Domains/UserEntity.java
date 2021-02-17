package com.bdaybumps.demo.Domains;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Buser")
@Transactional
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Buid;
    private String bfirstName;
    private String blastName;
    private String bemail;
    private String bpassword;
    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp creationDate;
    @UpdateTimestamp
    private Timestamp modifiedDate;
    @OneToMany(mappedBy = "userEntity",
            cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)

    private List<FriendsEntity> friends;

    public UserEntity()
    {

    }
    public void addEntity(FriendsEntity friendsEntity)
    {
        this.friends.add(friendsEntity);
    }
    public UserEntity(String firstName,String lastName,String email,String password)
    {
        this.bfirstName= firstName;
        this.blastName = lastName;
        this.bemail = email;
        this.bpassword = password;
    }

    public List<FriendsEntity> getFriends() {
        return friends;
    }

    public void setFriends(List<FriendsEntity> friends) {
        this.friends = friends;
        System.out.print("new friends list"+friends);
    }

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
                "Uid='" + Buid + '\'' +
                ", firstName='" + bfirstName + '\'' +
                ", lastName='" + blastName + '\'' +
                ", email='" + bemail + '\'' +
                ", password='" + bpassword + '\'' +
                '}';
    }

}
