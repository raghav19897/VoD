package com.raghav.vod.domain;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Data;

//@Entity
@Data
public class Stats implements Serializable {

  @Id
  @ManyToOne
  @JoinColumn(name = "videoId", referencedColumnName = "id")
  private Video video;
  @Id
  @ManyToOne
  @JoinColumn(name = "userId", referencedColumnName = "id")
  private User user;
  @Id
  private String emotion;
  @OneToOne
  @JoinColumn(name = "commentId", referencedColumnName = "id")
  private Comment comment;
}
