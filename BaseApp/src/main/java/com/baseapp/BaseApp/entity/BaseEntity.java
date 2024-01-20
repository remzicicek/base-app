package com.baseapp.BaseApp.entity;

import com.baseapp.BaseApp.constants.BaseConstant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
/**
 * @Setter(AccessLevel.PUBLIC) --> to indicate method type
 */
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = BaseConstant.COLUMN_ID)
    private Long id;

    @CreatedDate
    @Column(name = BaseConstant.COLUMN_CREATED_DATE)
    private Date createdDate;

    @CreatedBy
    @Column(name = BaseConstant.COLUMN_CREATED_BY)
    private String createdBy;

    @LastModifiedDate
    @Column(name = BaseConstant.COLUMN_UPDATED_DATE)
    private Date updatedDate;

    @LastModifiedBy
    @Column(name = BaseConstant.COLUMN_UPDATED_BY)
    private String updatedBy;

    /**
     * @Modifying annotation is used for soft delete
     */

}