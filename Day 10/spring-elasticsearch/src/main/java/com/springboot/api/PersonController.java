package com.springboot.api;

import com.springboot.entity.Person;
import com.springboot.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonRepository personRepository;

    @PostConstruct
    public void init(){
        Person person=new Person();
        person.setName("Mustafa");
        person.setSurname("CAN");
        person.setLocation("test");
        person.setBirthdate(Calendar.getInstance().getTime());
        person.setId("KK001");
        personRepository.save(person);
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<Person>> getPerson(@PathVariable String search) {
        List<Person> people = personRepository.findByNameLikeOrSurnameLike(search, search);
        return ResponseEntity.ok(people);

    }
}
