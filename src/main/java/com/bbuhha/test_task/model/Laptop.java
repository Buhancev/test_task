package com.bbuhha.test_task.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "laptops")
@Data
public class Laptop extends BaseEntity{

    @Column(name = "inches")
    private byte inches;
}
