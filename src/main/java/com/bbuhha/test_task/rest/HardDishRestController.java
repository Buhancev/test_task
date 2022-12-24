package com.bbuhha.test_task.rest;

import com.bbuhha.test_task.dto.ComputerDto;
import com.bbuhha.test_task.dto.HardDiskDto;
import com.bbuhha.test_task.model.Computer;
import com.bbuhha.test_task.model.HardDisk;
import com.bbuhha.test_task.service.Impl.HardDiskServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/harddisk", produces = "application/json")
public class HardDishRestController {
    private final HardDiskServiceImpl hardDiskService;

    @Autowired
    public HardDishRestController(HardDiskServiceImpl hardDiskService) {
        this.hardDiskService = hardDiskService;
    }

    @PostMapping("/")
    public HardDisk createOrUpdateComputer(@Valid @RequestBody HardDiskDto hardDiskDto) {
        return hardDiskService.saveOrUpdate(hardDiskDto.toEntity());
    }

    @DeleteMapping("/{id}")
    public HardDisk deleteById(@PathVariable(value = "id") Long id) {
        HardDisk result = hardDiskService.deleteById(id);

        return result;
    }

    @GetMapping("/")
    public Iterable<HardDisk> getAllComputers() {

        Iterable<HardDisk> result = hardDiskService.findAll();

        return result;
    }

    @GetMapping("/{id}")
    public HardDisk findById(@PathVariable(value = "id") Long id) {
        HardDisk result = hardDiskService.findById(id);

        return result;
    }
}
