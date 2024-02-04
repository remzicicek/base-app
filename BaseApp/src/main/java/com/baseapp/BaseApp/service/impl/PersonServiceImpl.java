package com.baseapp.BaseApp.service.impl;

import com.baseapp.BaseApp.entity.PersonEntity;
import com.baseapp.BaseApp.exception.PersonException;
import com.baseapp.BaseApp.mapper.PersonMapper;
import com.baseapp.BaseApp.model.PersonModel;
import com.baseapp.BaseApp.repository.PersonRepository;
import com.baseapp.BaseApp.service.PersonService;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    private final PersonMapper personMapper;

    private final KieContainer kieContainer;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository, PersonMapper personMapper, KieContainer kieContainer) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
        this.kieContainer = kieContainer;
    }

    @Override
    public PersonModel save(PersonModel model) {
        PersonEntity entity = personMapper.convertToEntity(model);
        return personMapper.convertToModel(personRepository.save(entity));
    }

    @Override
    public PersonModel getById(Long id) {
        if(!personRepository.existsById(id)){
            throw new PersonException("Person is not Found");
        }
        return personMapper.convertToModel(personRepository.getById(id));
    }

    @Override
    public void deleteById(Long id) {
        if(personRepository.existsById(id))
            personRepository.deleteById(id);
    }

    @Override
    public PersonModel runRules(PersonModel model) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(model);
        kieSession.fireAllRules();
        kieSession.dispose();
        return model;
    }
}
