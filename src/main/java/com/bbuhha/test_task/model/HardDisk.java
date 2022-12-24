package com.bbuhha.test_task.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hard_disks")
@Data
public class HardDisk extends BaseEntity{

    @Column(name = "capacity")
    private int capacity;
}
