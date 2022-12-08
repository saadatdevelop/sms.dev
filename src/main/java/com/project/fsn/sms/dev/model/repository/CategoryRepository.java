package com.project.fsn.sms.dev.model.repository;

import com.project.fsn.sms.dev.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    Optional<Category> findByCode(String code);

    Optional<Category> findByCodeAndValue(String code, String value);
}
