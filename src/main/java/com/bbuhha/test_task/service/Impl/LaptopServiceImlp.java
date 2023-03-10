package com.bbuhha.test_task.service.Impl;

import com.bbuhha.test_task.exceptionHandling.NoSuchException;
import com.bbuhha.test_task.model.Laptop;
import com.bbuhha.test_task.repository.LaptopRepo;
import com.bbuhha.test_task.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@org.springframework.stereotype.Service
public class LaptopServiceImlp implements Service<Laptop> {

    private final LaptopRepo laptopRepo;

    @Autowired
    public LaptopServiceImlp(LaptopRepo laptopRepo) {
        this.laptopRepo = laptopRepo;
    }


    @Override
    @Transactional
    public Laptop saveOrUpdate(Laptop laptop) {
        laptopRepo.save(laptop);

        return laptop;
    }

    @Override
    @Transactional
    public Laptop deleteById(Long id) {
        Optional<Laptop> result = laptopRepo.findById(id);

        if(result.isEmpty()) {
            throw new NoSuchException("Error! There is nothing on the specified ID = " + id);
        }

        laptopRepo.deleteById(id);

        return result.get();
    }

    @Override
    @Transactional
    public Laptop findById(Long id) {
        Optional<Laptop> result = laptopRepo.findById(id);

        if(result.isEmpty()) {
            throw new NoSuchException("Error! There is nothing on the specified ID = " + id);
        }

        return result.get();
    }

    @Override
    @Transactional
    public Iterable<Laptop> findAll() {
        Optional<Iterable<Laptop>> result = Optional.of(laptopRepo.findAll());

        return result.get();
    }
}
