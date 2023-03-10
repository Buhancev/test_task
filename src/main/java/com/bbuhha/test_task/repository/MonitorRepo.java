package com.bbuhha.test_task.repository;

import com.bbuhha.test_task.model.Monitor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorRepo extends CrudRepository<Monitor, Long> {
}
