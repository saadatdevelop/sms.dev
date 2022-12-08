package com.project.fsn.sms.dev.business.operation.categoryelement;

import com.project.fsn.sms.dev.business.common.codes.MessageCodes;
import com.project.fsn.sms.dev.business.exception.CommonException;
import com.project.fsn.sms.dev.business.operation.category.CategoryBusiness;
import com.project.fsn.sms.dev.model.entity.Category;
import com.project.fsn.sms.dev.model.entity.CategoryElement;
import com.project.fsn.sms.dev.model.repository.CategoryElementRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Named;
import java.util.HashSet;
import java.util.Set;
@Named
@RequiredArgsConstructor
@Slf4j
public class CategoryElementBusinessImpl implements CategoryElementBusiness {

    private final CategoryElementRepository categoryElementRepository;
    private final CategoryBusiness categoryBusiness;

    @Override
    public CategoryElement findByCode(String code) {
        return  categoryElementRepository.findByCode(code);
    }

    @Override
    public Boolean isCodeExistInEnum(String code, Class<?> enumClass) throws CommonException {
        log.debug(String.format(MessageCodes.INPUT_CODE, code));
        log.debug(String.format(MessageCodes.ENUM_CLASS, enumClass.getSimpleName()));
        boolean isCodeExistInEnum = Boolean.FALSE;
//        if (code != null) {
//            for (Object enumConstant : enumClass.getEnumConstants()) {
//                try {
//                    String enumCode = (String) GenericUtil.invokeMethodByClass(
//                            enumClass, enumConstant, Constants.ENUM_CODE);
//                    log.debug(String.format(MessageCodes.ENUM_CODE, enumCode));
//                    if (code.equals(enumCode)) {
//                        log.debug(MessageCodes.FOUND_CODE_IN_ENUM);
//                        isCodeExistInEnum = Boolean.TRUE;
//                        break;
//                    }
//                } catch (CommonException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        log.debug(String.format(MessageCodes.RESULT, isCodeExistInEnum));
        return isCodeExistInEnum;
    }

    @Override
    public Set<CategoryElement> getByEnumCode(String enumClass) {
        Set<CategoryElement> categoryElementList = new HashSet<>();
        if (enumClass != null) {
            Category category = categoryBusiness.findByCode(enumClass);
            if (category != null) {
                categoryElementList = category.getCategoryElementSet();
            }
        }
        return categoryElementList;
    }
}
