package com.sparta.tests.controller;

import com.sparta.tests.entity.CommonResponse;
import com.sparta.tests.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;
    /**
     * 한 회원의 userId가 주었을때 회원 정보를 조회하는 API
     * @param id
     */
    @GetMapping("/member/{id}")
    public CommonResponse getMemberInfo(@PathVariable Long id) {

        return memberService.findMember(id);
    }

    /**
     * 회원의 전체 목록을 조회하는 API
     */
    @GetMapping("/member")
    public CommonResponse getMemberList(){
        return memberService.findAllMember();
    }

}