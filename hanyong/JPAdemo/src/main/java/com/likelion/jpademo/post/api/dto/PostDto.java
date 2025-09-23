package com.likelion.jpademo.post.api.dto;

public record PostDto(
        Long id,
        String title,
        String content,
        Long memberId) {

}
