package com.bbuhha.test_task.dto;

import com.bbuhha.test_task.model.Laptop;
import lombok.Data;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class LaptopDto extends BaseEntityDto{
    @Min(13)
    @Max(17)
    private byte inches;

    public Laptop toEntity() {
        Laptop laptop = new Laptop();

        laptop.setId(super.id);
        laptop.setSerialNumber(super.serialNumber);
        laptop.setManufacturer(super.manufacturer);
        laptop.setAmount(super.amount);
        laptop.setInches(inches);

        return laptop;
    }

    public static LaptopDto fromEntity(Laptop laptop) {
        LaptopDto laptopDto = new LaptopDto();

        laptopDto.setSerialNumber(laptop.getSerialNumber());
        laptopDto.setManufacturer(laptop.getManufacturer());
        laptopDto.setAmount(laptop.getAmount());
        laptopDto.setInches(laptop.getInches());

        return laptopDto;
    }
}
