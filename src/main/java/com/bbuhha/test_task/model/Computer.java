package com.bbuhha.test_task.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "computers")
@Data
public class Computer extends BaseEntity{

    @Enumerated
    @Column(name = "form_factor")
    private FormFactor formFactor;

}
