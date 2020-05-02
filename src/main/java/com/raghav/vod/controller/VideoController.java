package com.raghav.vod.controller;

import com.raghav.vod.domain.Video;
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

  @PostMapping("/upload")
  public void uploadVideo(@ModelAttribute MultipartFile file, @ModelAttribute Video video){

  }

  @GetMapping("/watch")
  public String getVideo(@RequestParam long id){
    return "video location";
  }
}
