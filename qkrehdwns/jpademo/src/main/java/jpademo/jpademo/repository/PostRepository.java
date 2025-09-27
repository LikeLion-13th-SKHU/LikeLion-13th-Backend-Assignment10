package jpademo.jpademo.repository;

import jpademo.jpademo.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> { }

