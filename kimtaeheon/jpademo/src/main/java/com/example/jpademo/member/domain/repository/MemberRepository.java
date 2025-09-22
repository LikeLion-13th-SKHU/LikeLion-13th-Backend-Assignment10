package com.example.jpademo.member.domain.repository;

import com.example.jpademo.member.domain.Member;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    @EntityGraph(attributePaths = "posts")
    Optional<Member> findWithPostsById(Long id);
}
