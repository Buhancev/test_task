package com.bbuhha.test_task.rest;

import com.bbuhha.test_task.dto.MonitorDto;
import com.bbuhha.test_task.model.Monitor;
import com.bbuhha.test_task.service.Impl.MonitorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/monitors", produces = "application/json")
public class MonitorRestController {
    private final MonitorServiceImpl monitorService;

    @Autowired
    public MonitorRestController(MonitorServiceImpl monitorService ) {
        this.monitorService = monitorService;
    }

    @PostMapping("/")
    public Monitor createOrUpdate(@Valid @RequestBody MonitorDto monitorDto) {
        return monitorService.saveOrUpdate(monitorDto.toEntity());
    }

    @DeleteMapping("/{id}")
    public Monitor deleteById(@PathVariable(value = "id") Long id) {
        return monitorService.deleteById(id);
    }

    @GetMapping("")
    public Iterable<Monitor> getAll() {
        Iterable<Monitor> result = monitorService.findAll();

        return result;
    }

    @GetMapping("/{id}")
    public Monitor findById(@PathVariable(value = "id") Long id) {
        return monitorService.findById(id);
    }
}
