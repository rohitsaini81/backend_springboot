package com.project.project.Videos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:3000")
public class VideoController implements WebMvcConfigurer {
    @Autowired
    private VideoService videoService;


//    @GetMapping("/")
//    public String  home(){
//        return ("index.html");
//    }

    @GetMapping("/")
    public RedirectView Home(
            RedirectAttributes attributes) {
        attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView");
        attributes.addAttribute("attribute", "redirectWithRedirectView");
        return new RedirectView("/index.html");
    }




    @GetMapping("/videos")
    public List<VideoEntity> getAllVideos() {
        return videoService.getAllVideos();
    }

    @GetMapping("/search")
    public ResponseEntity<VideoEntity> getVideoById(@RequestParam Long id) { // ✅ Expect Long
        System.out.println("params id = "+id);
        VideoEntity video = videoService.getVideoById(id);
        if (video == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(video);
    }

    @PostMapping("/add/video")
    public VideoEntity addVideo(@RequestBody VideoEntity video) {
        return videoService.saveVideo(video);
    }
}
