package com.bbuhha.test_task.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "hard_disks")
public class HardDisk extends BaseEntity{

    @Column(name = "capacity")
    private int capacity;
}
