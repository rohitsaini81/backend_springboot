package com.project.project.Videos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<VideoEntity, String> {

    @Query(value = "SELECT * FROM videos WHERE to_tsvector('english', title) @@ to_tsquery('english', :query)", nativeQuery = true)
    List<VideoEntity> searchByKeyword(@Param("query") String query);



    // get videos where tags array contains a specific tag
    @Query(value = "SELECT * FROM videos WHERE :tag = ANY(tags)", nativeQuery = true)
    List<VideoEntity> findByTag(@Param("tag") String tag);
}

