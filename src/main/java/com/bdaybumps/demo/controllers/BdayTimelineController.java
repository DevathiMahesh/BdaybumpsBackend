package com.bdaybumps.demo.controllers;

import com.bdaybumps.demo.Domains.BfriendEntity;
import com.bdaybumps.demo.Services.BdayTimelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BdayTimelineController {
        @Autowired
        private BdayTimelineService bdayTimelineService;
        @GetMapping("/getTimeline/{buid}")
        public Map<String, List<BfriendEntity>> getBdayTimeline(@PathVariable("buid") Long buid)
        {
           return bdayTimelineService.getBdayTimeline(buid);
        }
}
