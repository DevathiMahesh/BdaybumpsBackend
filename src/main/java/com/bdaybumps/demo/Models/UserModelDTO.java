package com.bdaybumps.demo.Models;



import com.bdaybumps.demo.Domains.BfriendEntity;

import java.sql.Timestamp;
import java.util.List;

public class UserModelDTO {

    private Long buid;
    private String bfirstName;
    private String blastName;
    private String bemail;
    private String bpassword;

    public UserModelDTO()
    {

    }
    public UserModelDTO(Long buid,String bfirstName,String blastName,String bemail,String bpassword)
    {
        this.buid = buid;
        this.bfirstName= bfirstName;
        this.blastName = blastName;
        this.bemail = bemail;
        this.bpassword = bpassword;

    }

    private Timestamp creationDate;

    private Timestamp modifiedDate;

    public void setBuid(Long buid) {
        this.buid = buid;
    }

    public void setBemail(String bemail) {
        this.bemail = bemail;
    }

    public void setBfirstName(String bfirstName) {
        this.bfirstName = bfirstName;
    }

    public void setBlastName(String blastName) {
        this.blastName = blastName;
    }

    public void setBpassword(String bpassword) {
        this.bpassword = bpassword;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Long getBuid() {
        return buid;
    }

    public String getBemail() {
        return bemail;
    }

    public String getBfirstName() {
        return bfirstName;
    }

    public String getBlastName() {
        return blastName;
    }

    public String getBpassword() {
        return bpassword;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    @Override
    public String toString() {
        return "UserModelDTO{" +
                "buid=" + buid +
                ", bfirstName='" + bfirstName + '\'' +
                ", blastName='" + blastName + '\'' +
                ", bemail='" + bemail + '\'' +
                ", bpassword='" + bpassword + '\'' +
                ", creationDate=" + creationDate +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}
