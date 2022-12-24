package com.bbuhha.test_task.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "computers")
@Data
public class Computer extends BaseEntity{

    @Enumerated
    @Column(name = "form_factor")
    private FormFactor formFactor;

}
