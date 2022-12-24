package com.bbuhha.test_task.service.Impl;

import com.bbuhha.test_task.model.Laptop;
import com.bbuhha.test_task.repository.LaptopRepo;
import com.bbuhha.test_task.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@org.springframework.stereotype.Service
public class LaptopServiceImlp implements Service<Laptop> {

    private final LaptopRepo laptopRepo;

    @Autowired
    public LaptopServiceImlp(LaptopRepo laptopRepo) {
        this.laptopRepo = laptopRepo;
    }


    @Override
    public Laptop saveOrUpdate(Laptop laptop) {
        laptopRepo.save(laptop);

        return laptop;
    }

    @Override
    public Laptop deleteById(Long id) {
        Optional<Laptop> result = laptopRepo.findById(id);

        if(result.isEmpty()) {
            //
        }

        laptopRepo.deleteById(id);

        return result.get();
    }

    @Override
    public Laptop findById(Long id) {
        Optional<Laptop> result = laptopRepo.findById(id);

        if(result.isEmpty()) {
            //
        }

        return result.get();
    }

    @Override
    public Iterable<Laptop> findAll() {
        Optional<Iterable<Laptop>> result = Optional.of(laptopRepo.findAll());

        if(result.isEmpty()) {
            //
        }

        return result.get();
    }
}
