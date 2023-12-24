package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Person;
import com.project.repo.PersonRepo;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepo personRepository;

    @Autowired
    public PersonService(PersonRepo personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(String partyId) {
        return personRepository.findById(partyId);
    }

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

//    public Person updatePerson(String partyId, Person updatedPerson) {
//        if (personRepository.existsById(partyId)) {
//            updatedPerson.setPartyId(partyId);
//            return personRepository.save(updatedPerson);
//        }
//        return null; // Handle not found scenario as needed
//    }

    public void deletePerson(String partyId) {
        personRepository.deleteById(partyId);
    }
}

