package com.willdev.service;

import com.willdev.domain.People;

import java.util.List;

public interface PeopleService {

    People registrarPeople(People p) throws Exception;
    People modificarPeople(People p) throws Exception;
    List<People> listarPeople() throws Exception;
    People listarPeoplePorId(Long id) throws  Exception;
    void eliminarPeople(Long id) throws Exception;

}
