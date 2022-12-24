package com.bbuhha.test_task.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "hard_disks")
@Data
public class HardDisk extends BaseEntity{

    @Column(name = "capacity")
    private int capacity;
}
