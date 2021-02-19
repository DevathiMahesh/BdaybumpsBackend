package com.bdaybumps.demo.Domains;

import javax.persistence.*;

@Entity
@Table(name="Notifications")
public class NotificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Nid;
    private String Title;
    private String Description;

    public void setDescription(String description) {
        Description = description;
    }

    public void setNid(Long nid) {
        Nid = nid;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public Long getNid() {
        return Nid;
    }

    public String getTitle() {
        return Title;
    }

    @Override
    public String toString() {
        return "NotificationEntity{" +
                "Nid='" + Nid + '\'' +
                ", Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
