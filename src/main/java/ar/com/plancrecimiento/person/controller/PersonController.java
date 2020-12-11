package ar.com.plancrecimiento.person.controller;


import ar.com.plancrecimiento.person.model.Person;
import ar.com.plancrecimiento.person.repository.PersonDAO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("person")
public class PersonController {

    private PersonDAO personDAO = new PersonDAO();


    @PostMapping("/postPerson")
    public ResponseEntity postPerson(@RequestBody Person person){
        personDAO.addPerson(person);

        return ResponseEntity.accepted().body("Accepted");
    }

    @GetMapping("/getPersons")
    public List<Person> getPersons(){
        return personDAO.getListPersons();
    }

    @GetMapping("/getPersonById/{id}")
    public Optional<Person> getPersonById(@PathVariable Long id){
        return personDAO.getPersonById(id);
    }

}
