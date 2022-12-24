package com.bbuhha.test_task.service;


import com.bbuhha.test_task.model.Computer;

import java.util.List;

public interface ComputerService {
    public Computer saveOrUpdate(Computer computer);

    public Computer deleteById(Long id);

    public Computer findById(Long id);

    public Iterable<Computer> findAll();
}
