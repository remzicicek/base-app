package com.baseapp.BaseApp.service;


import com.baseapp.BaseApp.model.PersonModel;

public interface PersonService {

    PersonModel save(PersonModel model);

    PersonModel getById(Long id);

    void deleteById(Long id);

    PersonModel runRules(PersonModel model);
}
