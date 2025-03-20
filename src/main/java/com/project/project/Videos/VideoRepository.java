package com.project.project.Videos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<VideoEntity, Long> {
//    Optional<VideoEntity> findById(Long id); // ✅ Use the built-in method
}

