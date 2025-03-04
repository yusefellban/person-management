package com.example.postgresSQL.controller;

import com.example.postgresSQL.service.PersonService;
import com.example.postgresSQL.model.Person;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/all")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable long id) {
        return personService.getPersonById(id);
    }

    @PostMapping("/add")
    public Person createPerson(@Valid @RequestBody Person person) {
        return personService.savePerson(person);
    }

    @PutMapping("/update/{id}")
    public Person updatePerson(@PathVariable Long id,@Valid @RequestBody Person updatedPerson) {
        return personService.updatePerson(id, updatedPerson);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return "Person with ID " + id + " has been deleted successfully.";
    }

}
