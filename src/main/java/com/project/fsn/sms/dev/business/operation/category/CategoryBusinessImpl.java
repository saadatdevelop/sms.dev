package com.project.fsn.sms.dev.business.operation.category;

import com.project.fsn.sms.dev.model.entity.Category;
import com.project.fsn.sms.dev.model.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;

import javax.inject.Named;

@Named
@RequiredArgsConstructor
public class CategoryBusinessImpl implements CategoryBusiness {

    private final CategoryRepository categoryRepository;

    @Override
    public Category findByCode(String code) {
        final Category[] category = {null};
        categoryRepository.findByCode(code).ifPresent(foundedCategory -> category[0] = foundedCategory);
        return category[0];
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }
}
