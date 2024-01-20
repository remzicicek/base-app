package com.baseapp.BaseApp.controller;

import com.baseapp.BaseApp.model.PersonModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/person")
public interface PersonRestController {

    @PostMapping("/add")
    ResponseEntity<PersonModel> save(@Valid @NotNull @RequestBody PersonModel person);

    @GetMapping("/getPerson/{id}")
    ResponseEntity<PersonModel> getById(@Valid @NotNull @PathVariable Long id);

    @DeleteMapping("delete/{id}")
    ResponseEntity<?> deleteById(@Valid @NotNull @PathVariable Long id);
}
