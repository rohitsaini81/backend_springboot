package com.project.project;

import jakarta.persistence.*;

@Entity
@Table(name = "videos")
public class VideoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String id;
    private String title;
    private String img_url;
    private String video_url;
    private String description;
    private String keywords;
    private String tags;

    public VideoEntity() {} // Required default constructor

    public VideoEntity(String id,String title, String img_url, String video_url, String keywords, String tags, String description) {
        this.id= id;
        this.title = title;
        this.img_url = img_url;
        this.video_url = video_url;
        this.description = description;
        this.keywords = keywords;
        this.tags = tags;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getImage() { return img_url; }
    public String getVideo() { return video_url; }
    public String getDescription() { return description; }
    public String getKeywords() { return keywords; }
    public String getTag() { return tags; }
}
