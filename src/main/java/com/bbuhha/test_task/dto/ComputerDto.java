package com.bbuhha.test_task.dto;

import com.bbuhha.test_task.model.BaseEntity;
import com.bbuhha.test_task.model.Computer;
import com.bbuhha.test_task.model.FormFactor;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

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
