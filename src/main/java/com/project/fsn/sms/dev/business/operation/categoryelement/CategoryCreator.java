package com.project.fsn.sms.dev.business.operation.categoryelement;

import com.project.fsn.sms.dev.business.common.enums.category.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.inject.Named;

@Named
@RequiredArgsConstructor
class CategoryCreator {
    private final CategoryElementCreator categoryElementCreator;

    @EventListener(ApplicationReadyEvent.class)
    public void createAllCategories() {
        categoryElementCreator.saveOrUpdateByEnum(SMSContactInformationType.class);
        categoryElementCreator.saveOrUpdateByEnum(SMSCourseType.class);
        categoryElementCreator.saveOrUpdateByEnum(SMSCurrencyType.class);
        categoryElementCreator.saveOrUpdateByEnum(SMSGenderType.class);
        categoryElementCreator.saveOrUpdateByEnum(SMSUserType.class);
    }
}
