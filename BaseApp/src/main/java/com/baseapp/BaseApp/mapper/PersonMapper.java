package com.baseapp.BaseApp.mapper;

import com.baseapp.BaseApp.entity.PersonEntity;
import com.baseapp.BaseApp.model.PersonModel;

public interface PersonMapper {
    PersonEntity convertToEntity(PersonModel model);
    PersonModel convertToModel(PersonEntity entity);
}
