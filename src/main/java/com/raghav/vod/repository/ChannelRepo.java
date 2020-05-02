package com.raghav.vod.repository;

import com.raghav.vod.domain.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepo extends JpaRepository<Channel, Long> {

}
