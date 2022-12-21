package com.bbuhha.test_task.repository;

import com.bbuhha.test_task.model.Computer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepo extends CrudRepository<Computer, Long> {
}
