package com.baseapp.BaseApp.model;

import com.baseapp.BaseApp.constants.PersonConstant;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonModel extends BaseModel {

    @Size(max = PersonConstant.MAX_NAME_SIZE)
    String name;

    @Max(PersonConstant.POINT_MAX_VALUE)
    @Min(PersonConstant.POINT_MIN_VALUE)
    Integer point;

    Double percentageOfEmployment;
}
