package com.bdaybumps.demo.Domains;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name="feedcard")
public class FeedCardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedcardid;
    private String feedtitle;
    private byte[] feedimage;
    private Boolean memory;
    private String[] hashtags;

    public void setFeedcardid(Long feedcardid) {
        this.feedcardid = feedcardid;
    }

    public void setFeedtitle(String feedtitle) {
        this.feedtitle = feedtitle;
    }

    public void setHashtags(String[] hashtags) {
        this.hashtags = hashtags;
    }

    public void setMemory(Boolean memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "FeedCardEntity{" +
                "feedcardid=" + feedcardid +
                ", feedtitle='" + feedtitle + '\'' +
                ", memory=" + memory +
                ", hashtags=" + Arrays.toString(hashtags) +
                '}';
    }
}
