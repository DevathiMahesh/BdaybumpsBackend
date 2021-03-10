package com.bdaybumps.demo.Domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;

@Entity
public class GalleryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long albumId;
    private String albumName;
    private byte[] pics;

    public byte[] getPics() {
        return pics;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setPics(byte[] pics) {
        this.pics = pics;
    }

    @Override
    public String toString() {
        return "GalleryEntity{" +
                "albumId=" + albumId +
                ", albumName='" + albumName + '\'' +
                ", pics=" + Arrays.toString(pics) +
                '}';
    }
}
