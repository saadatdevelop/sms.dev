package com.project.fsn.sms.dev.model.entity;


import com.project.fsn.sms.dev.model.entity.util.BaseEntity;
import com.project.fsn.sms.dev.model.entity.util.codes.ColumnDefinitionType;
import com.project.fsn.sms.dev.model.entity.util.codes.EntityName;
import com.project.fsn.sms.dev.model.entity.util.codes.FieldName;
import com.project.fsn.sms.dev.model.entity.util.codes.TableName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Getter
@Setter

@Entity(name = EntityName.CATEGORY)
@Table(name = TableName.CATEGORY)
public class Category extends BaseEntity {

    @Column(name = FieldName.CODE, columnDefinition = ColumnDefinitionType.VARCHAR_2_50, nullable = false)
    private String code;

    @Column(name = FieldName.VALUE, columnDefinition = ColumnDefinitionType.VARCHAR_2_50, nullable = false)
    private String value;

    @OneToMany(
            mappedBy = EntityName.CATEGORY,
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            targetEntity = com.project.fsn.sms.dev.model.entity.CategoryElement.class,
            fetch = FetchType.LAZY
    )
    private Set<CategoryElement> categoryElementSet = new HashSet<>();
}