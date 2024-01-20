package com.baseapp.BaseApp.model;

import com.baseapp.BaseApp.constants.PersonConstant;
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
}
