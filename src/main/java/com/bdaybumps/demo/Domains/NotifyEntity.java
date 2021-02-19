package com.bdaybumps.demo.Domains;

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

    public void setNid(Long nid) {
        this.nid = nid;
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
