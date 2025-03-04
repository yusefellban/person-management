package com.example.postgresSQL.service;

import com.example.postgresSQL.exceptions.PersonNotFoundException;
import com.example.postgresSQL.model.Person;
import com.example.postgresSQL.model.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons() {
        return personRepository.findAllOrdered();
    }

    public Person getPersonById(long id) {
        return personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException("Person not found"));
    }


    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public void deletePerson(Long id) {
        if (personRepository.existsById(id)) {
            personRepository.deleteById(id);
        } else {
            throw new PersonNotFoundException("Person not found with id: " + id);
        }
    }

    @Transactional //This ensures safe updates and prevents inconsistencies.
    public Person updatePerson(Long id, Person updatedPerson) {
        Person existingPerson = personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException("Person not found with id: " + id));

        existingPerson.setName(updatedPerson.getName());
        existingPerson.setAge(updatedPerson.getAge());
        return personRepository.save(existingPerson);
    }
}
