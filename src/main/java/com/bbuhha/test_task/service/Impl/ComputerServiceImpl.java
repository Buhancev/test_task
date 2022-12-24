package com.bbuhha.test_task.service.Impl;

import com.bbuhha.test_task.model.Computer;
import com.bbuhha.test_task.repository.ComputerRepo;
import com.bbuhha.test_task.service.ComputerService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputerServiceImpl implements ComputerService {

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
    public Computer deleteById(Long id) {
        Optional<Computer> result = computerRepo.findById(id);

        if(result.isEmpty()) {
            //
        }

        computerRepo.deleteById(id);

        return result.get();
    }

    @Override
    public Computer findById(Long id) {
        Optional<Computer> result = computerRepo.findById(id);

        if(result.isEmpty()) {
            //
        }

        return result.get();
    }

    @Override
    public Iterable<Computer> findAll() {
        Optional<Iterable<Computer>> result = Optional.of(computerRepo.findAll());

        if(result.isEmpty()) {
            //
        }

        return result.get();
    }
}
