package com.project.fsn.sms.dev.business.common.enums.category;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SMSCurrencyType {
    RIAL("RIAL", "ریال"),
    DOLLAR("DOLLAR", "دلار"),
    EURO("EURO", "یورو");

    private final String code;
    private final String value;
}
