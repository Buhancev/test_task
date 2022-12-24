package com.bbuhha.test_task.rest;

import com.bbuhha.test_task.dto.ComputerDto;
import com.bbuhha.test_task.model.Computer;
import com.bbuhha.test_task.service.ComputerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/computers", produces = "application/json")
public class ComputerRestController {
    private final ComputerService computerService;

    @Autowired
    public ComputerRestController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @PostMapping("/")
    public Computer createOrUpdateComputer(@Valid @RequestBody ComputerDto computerDto) {
        return computerService.saveOrUpdate(computerDto.toEntity());
    }

    @DeleteMapping("/{id}")
    public Computer deleteById(@PathVariable(value = "id") Long id) {
        Computer computer = computerService.deleteById(id);

        return computer;
    }

    @GetMapping("/")
    public Iterable<Computer> getAllComputers() {

        Iterable<Computer> result = computerService.findAll();

        return result;
    }

    @GetMapping("/{id}")
    public Computer findById(@PathVariable(value = "id") Long id) {
        Computer result = computerService.findById(id);

        return result;
    }
}
