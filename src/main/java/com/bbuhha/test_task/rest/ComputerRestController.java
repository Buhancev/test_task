package com.bbuhha.test_task.rest;

import com.bbuhha.test_task.model.Computer;
import com.bbuhha.test_task.repository.ComputerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/computers", produces = "application/json")
public class ComputerRestController {

    @Autowired
    private ComputerRepo computerRepo;

    @GetMapping("/")
    public List<Computer> getAllComputers() {

        List<Computer> computerList = (List<Computer>) computerRepo.findAll();

        return computerList;
    }

    @PostMapping("/")
    public Computer createComputer() {
        return computerRepo.save(new Computer());
    }
}
