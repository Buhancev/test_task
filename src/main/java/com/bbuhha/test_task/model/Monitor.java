package com.bbuhha.test_task.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "monitors")
public class Monitor extends BaseEntity{

    @Column(name = "diagonal")
    private byte diagonal;
}
