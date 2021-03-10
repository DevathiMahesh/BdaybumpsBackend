package com.bdaybumps.demo.Services;

import com.bdaybumps.demo.Domains.GalleryEntity;
import com.bdaybumps.demo.Repository.GalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GalleryService {
    @Autowired
    private GalleryRepository galleryRepository;
    public String uploadPhoto(GalleryEntity g)
    {
       galleryRepository.save(g);
       return "Photos saved successfully";
    }
    public GalleryEntity getimage(String albumname)
    {
        return galleryRepository.findByAlbumName(albumname);
    }
}
