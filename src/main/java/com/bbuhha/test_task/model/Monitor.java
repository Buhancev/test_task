package com.bbuhha.test_task.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "monitors")
@Data
public class Monitor extends BaseEntity{

    @Column(name = "diagonal")
    private byte diagonal;
}
