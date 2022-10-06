package com.sparta.tests.service;

import com.sparta.tests.entity.CommonResponse;
import com.sparta.tests.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    public CommonResponse findMember(Long memberId) {
        try {
            return CommonResponse.response(Collections.singletonList((memberRepository.findById(memberId).get())));
        }catch (NoSuchElementException e){

           return CommonResponse.response(Collections.singletonList("회원 목록 상세 조회 실패"));
        }
    }


    public CommonResponse findAllMember() {
        try {
            return CommonResponse.response(Collections.singletonList(memberRepository.findAll()));
        }catch (Exception e){
            return CommonResponse.response(Collections.singletonList("회원 목록 조회 실패"));
        }
    }
}