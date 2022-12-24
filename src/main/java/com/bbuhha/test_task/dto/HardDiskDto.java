package com.bbuhha.test_task.dto;

import com.bbuhha.test_task.model.HardDisk;
import com.bbuhha.test_task.model.Laptop;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class HardDiskDto extends BaseEntityDto{

    @NotNull
    private int capacity;

    public HardDisk toEntity() {
        HardDisk hardDisk = new HardDisk();

        hardDisk.setId(super.id);
        hardDisk.setSerialNumber(super.serialNumber);
        hardDisk.setManufacturer(super.manufacturer);
        hardDisk.setAmount(super.amount);
        hardDisk.setCapacity(capacity);

        return hardDisk;
    }

    public static HardDiskDto fromEntity(HardDisk hardDisk) {
        HardDiskDto hardDiskDto = new HardDiskDto();

        hardDiskDto.setSerialNumber(hardDisk.getSerialNumber());
        hardDiskDto.setManufacturer(hardDisk.getManufacturer());
        hardDiskDto.setAmount(hardDisk.getAmount());
        hardDiskDto.setCapacity(hardDisk.getCapacity());

        return hardDiskDto;
    }
}
