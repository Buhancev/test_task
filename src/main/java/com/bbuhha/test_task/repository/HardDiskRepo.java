package com.bbuhha.test_task.repository;

import com.bbuhha.test_task.model.HardDisk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardDiskRepo extends CrudRepository<HardDisk, Long> {
}
