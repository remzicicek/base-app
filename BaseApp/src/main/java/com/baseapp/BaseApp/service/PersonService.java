package com.baseapp.BaseApp.service;


import com.baseapp.BaseApp.model.PersonModel;

public interface PersonService {

    PersonModel save(PersonModel person);

    PersonModel getById(Long id);

    void deleteById(Long id);

}
