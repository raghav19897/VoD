package com.raghav.vod.repository;

import com.raghav.vod.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepo extends JpaRepository<Video, Long> {

}
