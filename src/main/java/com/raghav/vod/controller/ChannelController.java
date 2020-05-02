package com.raghav.vod.controller;

import com.raghav.vod.domain.Channel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/channel")
public class ChannelController {

  @PostMapping("/channel")
  public void createChannel(@RequestBody Channel channel){

  }
}
