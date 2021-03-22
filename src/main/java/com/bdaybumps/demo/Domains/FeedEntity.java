package com.bdaybumps.demo.Domains;

import javax.persistence.*;

@Entity
@Table(name="feed")
public class FeedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedid;
    private String ftitle;

    public void setFeedid(Long feedid) {
        this.feedid = feedid;
    }

    public void setFtitle(String ftitle) {
        this.ftitle = ftitle;
    }

    public Long getFeedid() {
        return feedid;
    }

    public String getFtitle() {
        return ftitle;
    }

    @Override
    public String toString() {
        return "FeedEntity{" +
                "feedid=" + feedid +
                ", ftitle='" + ftitle + '\'' +
                '}';
    }
}
