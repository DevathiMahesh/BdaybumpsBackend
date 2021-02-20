package com.bdaybumps.demo.Domains;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.apache.kafka.common.protocol.types.Field;

import javax.persistence.*;

@Entity
@Table(name="notify")
public class NotifyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nid;
    private String ntitle;
    private String ndescription;
    @ManyToOne
    @JoinColumn(name="notify_id",referencedColumnName = "Buid")
    @JsonBackReference
    private BuserEntity user2;
    public void setNid(Long nid) {
        this.nid = nid;
    }

    public void setUser2(BuserEntity user2) {
        this.user2 = user2;
    }

    public BuserEntity getUser2() {
        return user2;
    }

    public void setNdescription(String ndescription) {
        this.ndescription = ndescription;
    }

    public void setNtitle(String ntitle) { 
        this.ntitle = ntitle;
    }

    public Long getNid() {
        return nid;
    }

    public String getNdescription() {
        return ndescription;
    }

    public String getNtitle() {
        return ntitle;
    }

    @Override
    public String toString() {
        return "NotifyEntity{" +
                "nid=" + nid +
                ", ntitle='" + ntitle + '\'' +
                ", ndescription='" + ndescription + '\'' +
                '}';
    }
}
