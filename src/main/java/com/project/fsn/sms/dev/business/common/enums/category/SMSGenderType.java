package com.project.fsn.sms.dev.business.common.enums.category;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SMSGenderType {
    MAIL("MAIL", "مذکر"),
    FEMALE("FEMALE", "مونث"),
    TRANS("TRANS", "ترنس");

    private final String code;
    private final String value;
}
