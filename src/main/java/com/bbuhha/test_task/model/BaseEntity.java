package com.bbuhha.test_task.model;

import jakarta.persistence.*;
import lombok.Data;

@MappedSuperclass
@Data
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "serial_number")
    private Long serialNumber;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "amount")
    private int amount;
}
