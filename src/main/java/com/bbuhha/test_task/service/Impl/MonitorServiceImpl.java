package com.bbuhha.test_task.service.Impl;

import com.bbuhha.test_task.model.Laptop;
import com.bbuhha.test_task.model.Monitor;
import com.bbuhha.test_task.repository.MonitorRepo;
import com.bbuhha.test_task.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class MonitorServiceImpl implements Service<Monitor> {

    private final MonitorRepo monitorRepo;

    @Autowired
    public MonitorServiceImpl(MonitorRepo monitorRepo) {
        this.monitorRepo = monitorRepo;
    }

    @Override
    public Monitor saveOrUpdate(Monitor monitor) {
        monitorRepo.save(monitor);

        return monitor;
    }

    @Override
    public Monitor deleteById(Long id) {
        Optional<Monitor> result = monitorRepo.findById(id);

        if(result.isEmpty()) {
            //
        }

        monitorRepo.deleteById(id);

        return result.get();
    }

    @Override
    public Monitor findById(Long id) {
        Optional<Monitor> result = monitorRepo.findById(id);

        if(result.isEmpty()) {
            //
        }

        return result.get();
    }

    @Override
    public Iterable<Monitor> findAll() {
        Optional<Iterable<Monitor>> result = Optional.of(monitorRepo.findAll());

        if(result.isEmpty()) {
            //
        }

        return result.get();
    }
}
