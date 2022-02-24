package com.willdev.service.impl;

import com.willdev.domain.People;
import com.willdev.repository.PeopleRepository;
import com.willdev.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleRepository peopleRepository;

    @Override
    public People registrarPeople(People p) throws Exception {
        return peopleRepository.save(p);
    }

    @Override
    public People modificarPeople(People p) throws Exception {
        return peopleRepository.save(p);
    }

    @Override
    public List<People> listarPeople() throws Exception {
        return peopleRepository.findAll();
    }

    @Override
    public People listarPeoplePorId(Long id) throws Exception {
        Optional<People> op = peopleRepository.findById(id);
        return op.isPresent() ? op.get() : new People();
    }

    @Override
    public void eliminarPeople(Long id) throws Exception {
        peopleRepository.deleteById(id);
    }
}
