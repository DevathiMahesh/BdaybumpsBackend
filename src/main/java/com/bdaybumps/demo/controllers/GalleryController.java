package com.bdaybumps.demo.controllers;

import com.bdaybumps.demo.Domains.GalleryEntity;
import com.bdaybumps.demo.Services.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Multipart;
import java.io.IOException;

@RestController
public class GalleryController {
    @Autowired
    private GalleryService galleryService;
    @PostMapping("/uploadphoto")
    public String uploadPhoto(@RequestParam MultipartFile file) throws IOException {
        GalleryEntity g = new GalleryEntity();
        g.setAlbumName("album1");
        g.setPics(file.getBytes());
        return galleryService.uploadPhoto(g);
    }
    @GetMapping("/getimages/{albumname}")
    public GalleryEntity getImages(@PathVariable("albumname") String albumname)
    {
        return galleryService.getimage(albumname);
    }

}
