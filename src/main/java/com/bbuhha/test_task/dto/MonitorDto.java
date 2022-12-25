package com.bbuhha.test_task.dto;


import com.bbuhha.test_task.model.Monitor;
import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class MonitorDto extends BaseEntityDto{
    @NotNull
    private byte diagonal;

    public Monitor toEntity(){
        Monitor monitor = new Monitor();

        monitor.setId(id);
        monitor.setSerialNumber(serialNumber);
        monitor.setManufacturer(manufacturer);
        monitor.setPrice(price);
        monitor.setQuantityStock(quantityStock);

        monitor.setDiagonal(diagonal);

        return monitor;
    }

    public static MonitorDto fromEntity(Monitor monitor) {
        MonitorDto monitorDto = new MonitorDto();

        monitorDto.setId(monitor.getId());
        monitorDto.setSerialNumber(monitor.getSerialNumber());
        monitorDto.setManufacturer(monitor.getManufacturer());
        monitorDto.setPrice(monitor.getPrice());
        monitorDto.setQuantityStock(monitor.getQuantityStock());

        monitorDto.setDiagonal(monitor.getDiagonal());

        return monitorDto;
    }

}
