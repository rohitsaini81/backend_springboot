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

    public List<VideoEntity> getVideosBytag(String query){
        return videoRepository.findByTagsContaining(query);
    }

    public List<VideoEntity> getVideosByCategory(String type){
        return videoRepository.findByCategory(type);
    }

    public VideoEntity saveVideo(VideoEntity video) {
        return videoRepository.save(video);
    }
}
