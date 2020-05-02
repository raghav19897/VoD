package com.raghav.vod.controller;

import com.raghav.vod.domain.User;
import com.raghav.vod.repository.UserRepo;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserRepo userRepo;

  @PostMapping("/signup")
  public void signUp(@RequestBody User user) {
    try {
      Optional<User> existingUser = userRepo.findById(user.getId());
      if (existingUser.isEmpty()) {
        userRepo.save(user);
      }
      throw new Exception("User already exists.");
    } catch (Exception e) {
      System.out.println("Unable to create user due to " + e.getMessage());
    }
  }

  @GetMapping("signin")
  public String signIn(@RequestBody User user) {
    try {
      Optional<User> existingUser = userRepo.findById(user.getId());
      if(existingUser.isPresent()){
        if(existingUser.get().getPassword().equals(user.getPassword())){
          return "Valid user";
        }
      }
      throw new Exception("Invalid credentials");
    } catch (Exception e){
      return e.getMessage();
    }
  }
}
