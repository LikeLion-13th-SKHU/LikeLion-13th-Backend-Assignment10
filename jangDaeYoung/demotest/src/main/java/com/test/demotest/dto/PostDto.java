package com.test.demotest.dto;

public record PostDto(
        Long id,
        String title,
        String content,
        Long memberId) { }