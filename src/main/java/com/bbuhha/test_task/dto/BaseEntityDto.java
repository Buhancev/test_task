package com.bbuhha.test_task.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Null;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseEntityDto {

    @Null
    private Long id;

    @NotEmpty
    private Long serialNumber;

    @NotEmpty
    private String manufacturer;

    @NotEmpty
    private int amount;
}
