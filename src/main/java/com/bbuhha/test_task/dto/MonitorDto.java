package com.bbuhha.test_task.dto;

import com.bbuhha.test_task.model.BaseEntity;
import com.bbuhha.test_task.model.Monitor;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MonitorDto extends BaseEntityDto{
    @NotNull
    private byte diagonal;

    public Monitor toEntity(){
        Monitor monitor = new Monitor();

        monitor.setId(id);
        monitor.setSerialNumber(serialNumber);
        monitor.setManufacturer(manufacturer);
        monitor.setAmount(amount);
        monitor.setDiagonal(diagonal);

        return monitor;
    }

    public static MonitorDto fromEntity(Monitor monitor) {
        MonitorDto monitorDto = new MonitorDto();

        monitorDto.setSerialNumber(monitor.getSerialNumber());
        monitorDto.setManufacturer(monitor.getManufacturer());
        monitorDto.setAmount(monitor.getAmount());
        monitorDto.setDiagonal(monitor.getDiagonal());

        return monitorDto;
    }

}
