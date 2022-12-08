package com.project.fsn.sms.dev.business.operation.categoryelement;

import com.project.fsn.sms.dev.business.exception.CommonException;
import com.project.fsn.sms.dev.model.entity.CategoryElement;

import java.util.Set;

public interface CategoryElementBusiness {
    CategoryElement findByCode(String code);

    Boolean isCodeExistInEnum(String code, Class<?> enumClass) throws CommonException;

    Set<CategoryElement> getByEnumCode(String enumClass);
}
