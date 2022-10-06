package com.sparta.tests.entity;

import com.sparta.tests.dto.MemberInfoResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@NoArgsConstructor // 기본생성자를 만듭니다.
@AllArgsConstructor
@Table
@Getter
@Entity
public class Member {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String pw;

    public Member(String name, String email,String pw){
        this.email=email;
        this.name=name;
        this.pw=pw;

    }

    public Member (MemberInfoResponseDto memberInfoResponseDto){
        this.name=memberInfoResponseDto.getName();
        this.email=memberInfoResponseDto.getEmail();
        this.pw=memberInfoResponseDto.getPw();
    }

}