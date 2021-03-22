package com.bdaybumps.demo.Services;


import org.springframework.stereotype.Service;

@Service
public class FeedService {
    public String addFeedItem()
    {
        return "Feed Item added successfully";
    }
    public String deleteFeedItem()
    {
        return "Feed Item Deleted Successfully";
    }
}
