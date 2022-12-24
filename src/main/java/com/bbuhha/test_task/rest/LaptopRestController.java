package com.bbuhha.test_task.rest;

import com.bbuhha.test_task.dto.ComputerDto;
import com.bbuhha.test_task.dto.LaptopDto;
import com.bbuhha.test_task.model.Computer;
import com.bbuhha.test_task.model.Laptop;
import com.bbuhha.test_task.service.Impl.LaptopServiceImlp;
import com.bbuhha.test_task.service.Service;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/laptops", produces = "application/json")
public class LaptopRestController {
    private final LaptopServiceImlp laptopService;

    public LaptopRestController(LaptopServiceImlp laptopService) {
        this.laptopService = laptopService;
    }

    @PostMapping("/")
    public Laptop createOrUpdateLaptop(@Valid @RequestBody LaptopDto laptopDto) {
        return laptopService.saveOrUpdate(laptopDto.toEntity());
    }

    @DeleteMapping("/{id}")
    public Laptop deleteById(@PathVariable(value = "id") Long id) {
        return laptopService.deleteById(id);
    }

    @GetMapping("/")
    public Iterable<Laptop> getAllLaptops() {
        Iterable<Laptop> result = laptopService.findAll();

        return result;
    }

    @GetMapping("/{id}")
    public Laptop findById(@PathVariable(value = "id") Long id) {
        return laptopService.findById(id);
    }
}
