package com.sparta.chapter3_1.domain;

import lombok.Getter;

@Getter
public class MemoRequestDto {
    private String username;
    private String contents;
    private String nickname;

    public MemoRequestDto() {
    }
}
