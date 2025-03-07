package com.noterror.app.api.domain.member.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * 유저 정보 수정시 입력받는 정보
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateInfoDto {

    @NotEmpty(message = "전화번호를 공백없이 입력해주세요.")
    @Pattern(regexp = "^010\\d{3,4}\\d{4}$",
            message = "휴대폰 번호는 010으로 시작하는 11자리 숫자를 구분자(-) 없이 입력해주세요.")
    private String phone;

    /** 우편번호 */
    @NotEmpty
    private String zipCode;

    /** 도로명 주소 */
    @NotEmpty
    private String city;

    /** 상세 주소(사용자 입력) */
    private String detailAddress;

    // TODO 채식 유형
    private String vegetarianType;
}
