package com.bbuhha.test_task.model;

import jakarta.persistence.*;
import lombok.Data;

@MappedSuperclass
@Data
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;

    @Column(name = "serial_number")
    protected String serialNumber;

    @Column(name = "manufacturer")
    protected String manufacturer;

    @Column(name = "amount")
    protected int amount;
}
