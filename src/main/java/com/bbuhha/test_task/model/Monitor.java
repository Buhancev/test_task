package com.bbuhha.test_task.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "monitors")
@Data
public class Monitor extends BaseEntity{

    @Column(name = "diagonal")
    private byte diagonal;
}
