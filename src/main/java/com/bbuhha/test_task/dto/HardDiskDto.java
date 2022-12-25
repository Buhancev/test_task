package com.bbuhha.test_task.dto;

import com.bbuhha.test_task.model.HardDisk;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class HardDiskDto extends BaseEntityDto{

    @NotNull
    private int capacity;


    public HardDisk toEntity() {
        HardDisk hardDisk = new HardDisk();

        hardDisk.setId(id);
        hardDisk.setSerialNumber(serialNumber);
        hardDisk.setManufacturer(manufacturer);
        hardDisk.setPrice(price);
        hardDisk.setQuantityStock(quantityStock);

        hardDisk.setCapacity(capacity);

        return hardDisk;
    }

    public static HardDiskDto fromEntity(HardDisk hardDisk) {
        HardDiskDto hardDiskDto = new HardDiskDto();

        hardDiskDto.setId(hardDisk.getId());
        hardDiskDto.setSerialNumber(hardDisk.getSerialNumber());
        hardDiskDto.setManufacturer(hardDisk.getManufacturer());
        hardDiskDto.setPrice(hardDisk.getPrice());
        hardDiskDto.setQuantityStock(hardDisk.getQuantityStock());

        hardDiskDto.setCapacity(hardDisk.getCapacity());

        return hardDiskDto;
    }
}
