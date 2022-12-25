package com.bbuhha.test_task.rest;

import com.bbuhha.test_task.dto.HardDiskDto;
import com.bbuhha.test_task.model.HardDisk;
import com.bbuhha.test_task.service.Impl.HardDiskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/harddisks", produces = "application/json")
public class HardDishRestController {
    private final HardDiskServiceImpl hardDiskService;

    @Autowired
    public HardDishRestController(HardDiskServiceImpl hardDiskService) {
        this.hardDiskService = hardDiskService;
    }

    @PostMapping("/")
    public HardDisk createOrUpdate(@Valid @RequestBody HardDiskDto hardDiskDto) {
        return hardDiskService.saveOrUpdate(hardDiskDto.toEntity());
    }

    @DeleteMapping("/{id}")
    public HardDisk deleteById(@PathVariable(value = "id") Long id) {
        return hardDiskService.deleteById(id);
    }

    @GetMapping("")
    public Iterable<HardDisk> getAll() {
        Iterable<HardDisk> result = hardDiskService.findAll();

        return result;
    }

    @GetMapping("/{id}")
    public HardDisk findById(@PathVariable(value = "id") Long id) {
        return hardDiskService.findById(id);
    }
}
