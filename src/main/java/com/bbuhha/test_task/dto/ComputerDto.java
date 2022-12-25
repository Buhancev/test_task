package com.bbuhha.test_task.dto;

import com.bbuhha.test_task.model.Computer;
import com.bbuhha.test_task.model.FormFactor;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ComputerDto extends BaseEntityDto{
    @NotNull
    private FormFactor formFactor;

    public Computer toEntity() {
        Computer computer = new Computer();

        computer.setId(id);
        computer.setSerialNumber(serialNumber);
        computer.setManufacturer(manufacturer);
        computer.setPrice(price);
        computer.setQuantityStock(quantityStock);

        computer.setFormFactor(formFactor);

        return computer;
    }

    public static ComputerDto fromEntity(Computer computer) {
        ComputerDto computerDto = new ComputerDto();

        computerDto.setId(computer.getId());
        computerDto.setSerialNumber(computer.getSerialNumber());
        computerDto.setManufacturer(computer.getManufacturer());
        computerDto.setPrice(computer.getPrice());
        computerDto.setQuantityStock(computer.getQuantityStock());

        computerDto.setFormFactor(computer.getFormFactor());

        return computerDto;
    }
}
