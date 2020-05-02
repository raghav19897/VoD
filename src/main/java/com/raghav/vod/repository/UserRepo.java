package com.raghav.vod.repository;

import com.raghav.vod.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

}
