package com.baseapp.BaseApp.controller.impl;

import com.baseapp.BaseApp.controller.PersonRestController;
import com.baseapp.BaseApp.model.PersonModel;
import com.baseapp.BaseApp.service.PersonService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestControllerImpl implements PersonRestController {

    PersonService personService;

    @Autowired
    public PersonRestControllerImpl(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public ResponseEntity<PersonModel> save(@Valid @NotNull PersonModel model) {
        PersonModel newPerson = personService.save(model);
        return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<PersonModel> getById(@Valid @NotNull Long id) {
        PersonModel getPerson = personService.getById(id);
        return new ResponseEntity<>(getPerson, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> deleteById(@Valid @NotNull Long id) {
        personService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PersonModel> runRules(PersonModel model) {
        return new ResponseEntity<>(personService.runRules(model), HttpStatus.OK);
    }
}
