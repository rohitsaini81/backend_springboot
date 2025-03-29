package com.project.project.Videos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class VideoService {
    @Autowired
    private VideoRepository videoRepository;

    public List<VideoEntity> getAllVideos() {
        return videoRepository.findAll();
    }

    public VideoEntity getVideoById(String id) { // ✅ Expect Long instead of String
        return videoRepository.findById(id).orElse(null);
    }


    public List<VideoEntity> getVideosByKey(String query) {
        String formattedQuery = query.replace(" ", " & "); // Convert "sister love" -> "sister & love"
        return videoRepository.searchByKeyword(formattedQuery);
    }



    public List<VideoEntity> searchByTag(String tag) {
        return videoRepository.findByTag(tag);
    }




}
