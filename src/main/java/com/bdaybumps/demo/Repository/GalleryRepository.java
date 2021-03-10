package com.bdaybumps.demo.Repository;

import com.bdaybumps.demo.Domains.GalleryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GalleryRepository extends JpaRepository<GalleryEntity,Long> {
    GalleryEntity findByAlbumName(String albumname);
    @Override
    List<GalleryEntity> findAll();
}
