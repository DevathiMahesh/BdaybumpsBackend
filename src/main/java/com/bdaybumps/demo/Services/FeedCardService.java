package com.bdaybumps.demo.Services;

import org.springframework.stereotype.Service;

@Service
public class FeedCardService {
    public String CreateFeedItem()
    {
        return "Feed Item Created";
    }
    public String DeleteFeedItem()
    {
        return "Feed Item Deleted";
    }
}
