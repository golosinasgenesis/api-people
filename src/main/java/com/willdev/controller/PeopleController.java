package com.willdev.controller;

import com.willdev.domain.People;
import com.willdev.exception.ModeloNotFoundException;
import com.willdev.service.PeopleService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/persona")
public class PeopleController {

    @Autowired
    PeopleService peopleService;

    @GetMapping
    public ResponseEntity<List<People>> listarPersona() throws Exception{
        System.out.println("Williams");

        List<People> peopleList = peopleService.listarPeople();
        return new ResponseEntity<List<People>>(peopleList, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<People> listarPersonaPorId(@PathVariable("id") Long id) throws Exception{
        People people = peopleService.listarPeoplePorId(id);
        if(people.getId()==null){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: "+id);
        }
        return new ResponseEntity<People>(people, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<People> regisrarPersona(@Valid @RequestBody People p) throws  Exception {
        People people = peopleService.registrarPeople(p);
        return new ResponseEntity<People>(people, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<People> actualizarPersona(@Valid @RequestBody People p) throws Exception{
        People people = peopleService.modificarPeople(p);
        return new ResponseEntity<People>(people, HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<Void> eliminarPersona(@PathVariable("id") Long id) throws  Exception{
        People people = peopleService.listarPeoplePorId(id);
        if(people.getId()==null){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: "+id);
        }
        peopleService.eliminarPeople(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
