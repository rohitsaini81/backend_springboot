package com.project.project.Videos;

import jakarta.persistence.*;

@Entity
@Table(name = "videos")
public class VideoEntity {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String title;
    private String img_url;
    private String video_url;
    private String description;
    private String category;
    private String tags;

    public VideoEntity() {} // Required default constructor

    public VideoEntity(String id,String title, String img_url, String video_url, String category, String tags, String description) {
        this.id= id;
        this.title = title;
        this.img_url = img_url;
        this.video_url = video_url;
        this.description = description;
        this.category = category;
        this.tags = tags;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getImage() { return img_url; }
    public String getVideo() { return video_url; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public String getTag() { return tags; }
}
