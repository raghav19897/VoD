package com.raghav.vod.controller;

import com.raghav.vod.domain.Video;
import com.raghav.vod.repository.VideoRepo;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/video")
public class VideoController {

  @Autowired
  private VideoRepo videoRepo;

  @PostMapping("/upload")
  public void uploadVideo(@ModelAttribute MultipartFile file, @ModelAttribute Video video) {
    try {
//      File newFile = new File("");
//      FileOutputStream fout = new FileOutputStream(newFile);
//      fout.write(file.getBytes());
//      fout.close();
      videoRepo.save(video);
    } catch (Exception e) {
      System.out.println("Unable to upload video due to " + e.getMessage());
    }
  }

  @GetMapping("/watch")
  public Video getVideo(@RequestParam long id) {
    Optional<Video> video = videoRepo.findById(id);
    return video.orElse(null);
  }
}
