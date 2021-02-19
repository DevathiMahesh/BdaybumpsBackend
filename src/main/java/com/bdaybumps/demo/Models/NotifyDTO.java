package com.bdaybumps.demo.Models;

import org.apache.kafka.common.protocol.types.Field;

public class NotifyDTO {
    private String ntitle;
    private String ndescription;

    public void setNdescription(String ndescription) {
        this.ndescription = ndescription;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    public String getNtitle() {
        return ntitle;
    }

    public String getNdescription() {
        return ndescription;
    }

    @Override
    public String toString() {
        return "NotifyDTO{" +
                "ntitle='" + ntitle + '\'' +
                ", ndescription='" + ndescription + '\'' +
                '}';
    }
}
