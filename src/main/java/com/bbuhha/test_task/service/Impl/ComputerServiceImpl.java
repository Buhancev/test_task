package com.bbuhha.test_task.service.Impl;

import com.bbuhha.test_task.exceptionHandling.NoSuchException;
import com.bbuhha.test_task.model.Computer;
import com.bbuhha.test_task.repository.ComputerRepo;
import com.bbuhha.test_task.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ComputerServiceImpl implements Service<Computer> {

    private final ComputerRepo computerRepo;

    @Autowired
    public ComputerServiceImpl(ComputerRepo computerRepo) {
        this.computerRepo = computerRepo;
    }

    @Override
    @Transactional
    public Computer saveOrUpdate(Computer computer) {
            computerRepo.save(computer);

            return computer;
    }

    @Override
    @Transactional
    public Computer deleteById(Long id) {
        Optional<Computer> result = computerRepo.findById(id);

        if(result.isEmpty()) {
            throw new NoSuchException("Error! There is nothing on the specified ID = " + id);
        }

        computerRepo.deleteById(id);

        return result.get();
    }

    @Override
    @Transactional
    public Computer findById(Long id) {
        Optional<Computer> result = computerRepo.findById(id);

        if(result.isEmpty()) {
            throw new NoSuchException("Error! There is nothing on the specified ID = " + id);
        }

        return result.get();
    }

    @Override
    @Transactional
    public Iterable<Computer> findAll() {
        Optional<Iterable<Computer>> result = Optional.of(computerRepo.findAll());

        return result.get();
    }
}
