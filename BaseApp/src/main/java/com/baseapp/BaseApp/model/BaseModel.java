package com.baseapp.BaseApp.model;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public abstract class BaseModel {

    private Long id;

    private Date createdDate;

    private String createdBy;

    private Date updatedDate;

    private String updatedBy;

}