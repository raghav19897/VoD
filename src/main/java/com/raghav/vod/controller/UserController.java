package com.raghav.vod.controller;

import com.raghav.vod.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @PostMapping("/signup")
  public void signUp(@RequestBody User user){

  }

  @GetMapping("signin")
  public String signIn(@RequestBody User user){
    return "Valid or Invalid";
  }
}
