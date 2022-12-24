package com.bbuhha.test_task.repository;

import com.bbuhha.test_task.model.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends CrudRepository<Laptop, Long> {
}
