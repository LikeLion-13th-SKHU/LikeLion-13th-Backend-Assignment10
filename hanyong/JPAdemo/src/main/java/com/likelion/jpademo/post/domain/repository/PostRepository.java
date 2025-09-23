package com.likelion.jpademo.post.domain.repository;

import com.likelion.jpademo.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository  extends JpaRepository<Post, Long> {

}
