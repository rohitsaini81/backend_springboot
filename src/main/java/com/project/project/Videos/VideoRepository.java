package com.project.project.Videos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<VideoEntity, Long> {

    List<VideoEntity> findByTagsContaining(String tag);
    List<VideoEntity> findByCategory(String category);

}

