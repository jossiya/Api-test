package com.sparta.tests.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse {
    private List<Object> result;

    public static CommonResponse response(List<Object> result){
        CommonResponse commonResponse = CommonResponse.builder().result(result).build();
        return commonResponse;
    }

}
