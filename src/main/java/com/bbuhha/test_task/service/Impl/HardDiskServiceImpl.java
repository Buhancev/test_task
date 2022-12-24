package com.bbuhha.test_task.service.Impl;

import com.bbuhha.test_task.model.HardDisk;
import com.bbuhha.test_task.model.Monitor;
import com.bbuhha.test_task.repository.HardDiskRepo;
import com.bbuhha.test_task.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@org.springframework.stereotype.Service
public class HardDiskServiceImpl implements Service<HardDisk> {

    private final HardDiskRepo hardDiskRepo;

    @Autowired
    public HardDiskServiceImpl(HardDiskRepo hardDiskRepo) {
        this.hardDiskRepo = hardDiskRepo;
    }

    @Override
    @Transactional
    public HardDisk saveOrUpdate(HardDisk hardDisk) {
        hardDiskRepo.save(hardDisk);

        return hardDisk;
    }

    @Override
    @Transactional
    public HardDisk deleteById(Long id) {
        Optional<HardDisk> result = hardDiskRepo.findById(id);

        if(result.isEmpty()) {
            //
        }

        hardDiskRepo.deleteById(id);

        return result.get();
    }

    @Override
    @Transactional
    public HardDisk findById(Long id) {
        Optional<HardDisk> result = hardDiskRepo.findById(id);

        if(result.isEmpty()) {
            //
        }

        return result.get();
    }

    @Override
    @Transactional
    public Iterable<HardDisk> findAll() {
        Optional<Iterable<HardDisk>> result = Optional.of(hardDiskRepo.findAll());

        if(result.isEmpty()) {
            //
        }

        return result.get();
    }
}
