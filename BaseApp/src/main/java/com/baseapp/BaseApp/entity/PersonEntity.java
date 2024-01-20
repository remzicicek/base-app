package com.baseapp.BaseApp.entity;

import com.baseapp.BaseApp.constants.PersonConstant;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Table(name = "people")
public class PersonEntity extends BaseEntity{

    @NotBlank
    @Column(name = PersonConstant.COLUMN_PERSON_NAME, nullable = false)
    @Size(max = PersonConstant.MAX_NAME_SIZE)
    @UniqueElements
    String name;
}
