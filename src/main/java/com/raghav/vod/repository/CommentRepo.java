package com.raghav.vod.repository;

import com.raghav.vod.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {

}
