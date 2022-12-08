package com.project.fsn.sms.dev.business.common.enums.category;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SMSCourseType {

    THEORETICAL("THEORETICAL", "نظری"),
    PRACTICAL("PRACTICAL", "عملی"),
    LABORATORY("LABORATORY", "آزمایشگاهی");

    private final String code;
    private final String value;
}
