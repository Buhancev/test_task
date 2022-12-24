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

        computer.setId(super.id);
        computer.setSerialNumber(super.serialNumber);
        computer.setManufacturer(super.manufacturer);
        computer.setAmount(super.amount);
        computer.setFormFactor(formFactor);

        return computer;
    }

    public static ComputerDto fromEntity(Computer computer) {
        ComputerDto computerDto = new ComputerDto();

        computerDto.setSerialNumber(computer.getSerialNumber());
        computerDto.setManufacturer(computer.getManufacturer());
        computerDto.setAmount(computer.getAmount());
        computerDto.setFormFactor(computer.getFormFactor());

        return computerDto;
    }
}
