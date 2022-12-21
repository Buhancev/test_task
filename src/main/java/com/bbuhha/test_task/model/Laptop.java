package com.bbuhha.test_task.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "laptops")
public class Laptop extends BaseEntity{

    @Column(name = "inches")
    private byte inches;
}
