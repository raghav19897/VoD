package com.raghav.vod.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Video {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private String description;
  @ManyToOne
  @JoinColumn(name = "channelId", referencedColumnName = "id")
  private Channel channel;
}
