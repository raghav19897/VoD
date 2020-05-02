package com.raghav.vod.controller;

import com.raghav.vod.domain.Channel;
import com.raghav.vod.repository.ChannelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/channel")
public class ChannelController {

  @Autowired
  private ChannelRepo channelRepo;

  @PostMapping("/create")
  public void createChannel(@RequestBody Channel channel) {
    try {
      channelRepo.save(channel);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
