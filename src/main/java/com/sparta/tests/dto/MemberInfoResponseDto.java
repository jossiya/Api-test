package com.sparta.tests.dto;

import com.sparta.tests.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberInfoResponseDto {

    private Long id;
    private String name;
    private String email;
    private String pw;

    public MemberInfoResponseDto(Member member) {
        this.id=member.getId();
        this.name = member.getName();
        this.email= member.getEmail();
        this.pw=member.getEmail();
    }
}
