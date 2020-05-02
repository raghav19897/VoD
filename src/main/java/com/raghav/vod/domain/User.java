package com.raghav.vod.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

  @Id
  private String id;
  private String password;
  private String name;
}
