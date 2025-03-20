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

    public VideoEntity getVideoById(Long id) { // ✅ Expect Long instead of String
        return videoRepository.findById(id).orElse(null);
    }

    public VideoEntity saveVideo(VideoEntity video) {
        return videoRepository.save(video);
    }
}
