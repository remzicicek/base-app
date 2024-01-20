package com.baseapp.BaseApp.mapper.impl;

import com.baseapp.BaseApp.entity.PersonEntity;
import com.baseapp.BaseApp.mapper.PersonMapper;
import com.baseapp.BaseApp.model.PersonModel;
import org.springframework.stereotype.Component;

@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonEntity convertToEntity(PersonModel model) {
        if ( model == null ) {
            return null;
        }

        PersonEntity personEntity = new PersonEntity();

        personEntity.setId( model.getId() );
        personEntity.setCreatedDate( model.getCreatedDate() );
        personEntity.setCreatedBy( model.getCreatedBy() );
        personEntity.setUpdatedDate( model.getUpdatedDate() );
        personEntity.setUpdatedBy( model.getUpdatedBy() );
        personEntity.setName( model.getName() );

        return personEntity;
    }

    @Override
    public PersonModel convertToModel(PersonEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PersonModel personModel = new PersonModel();

        personModel.setId( entity.getId() );
        personModel.setCreatedDate( entity.getCreatedDate() );
        personModel.setCreatedBy( entity.getCreatedBy() );
        personModel.setUpdatedDate( entity.getUpdatedDate() );
        personModel.setUpdatedBy( entity.getUpdatedBy() );
        personModel.setName( entity.getName() );

        return personModel;
    }
}
