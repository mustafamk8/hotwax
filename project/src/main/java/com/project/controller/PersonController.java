package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.project.model.Person;
import com.project.service.PersonService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAllPersons() {
        List<Person> persons = personService.getAllPersons();
        return ResponseEntity.ok(persons);
    }

    @GetMapping("/{partyId}")
    public ResponseEntity<Person> getPersonById(@PathVariable String partyId) {
        Optional<Person> person = personService.getPersonById(partyId);
        return person.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        Person createdPerson = personService.createPerson(person);
        return new ResponseEntity<>(createdPerson, HttpStatus.CREATED);
    }

//    @PutMapping("/{partyId}")
//    public ResponseEntity<Person> updatePerson(@PathVariable String partyId, @RequestBody Person updatedPerson) {
//        Person person = personService.updatePerson(partyId, updatedPerson);
//        return person != null ? ResponseEntity.ok(person) : ResponseEntity.notFound().build();
//    }

    @DeleteMapping("/{partyId}")
    public ResponseEntity<Void> deletePerson(@PathVariable String partyId) {
        personService.deletePerson(partyId);
        return ResponseEntity.noContent().build();
    }
}

