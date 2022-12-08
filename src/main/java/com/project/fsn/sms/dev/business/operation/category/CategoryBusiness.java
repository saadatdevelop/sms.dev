package com.project.fsn.sms.dev.business.operation.category;

import com.project.fsn.sms.dev.model.entity.Category;

public interface CategoryBusiness {
    Category findByCode(String code);

    void save(Category category);
}
