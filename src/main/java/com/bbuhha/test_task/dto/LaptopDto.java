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

        laptop.setId(id);
        laptop.setSerialNumber(serialNumber);
        laptop.setManufacturer(manufacturer);
        laptop.setPrice(price);
        laptop.setQuantityStock(quantityStock);

        laptop.setInches(inches);

        return laptop;
    }

    public static LaptopDto fromEntity(Laptop laptop) {
        LaptopDto laptopDto = new LaptopDto();

        laptopDto.setId(laptop.getId());
        laptopDto.setSerialNumber(laptop.getSerialNumber());
        laptopDto.setManufacturer(laptop.getManufacturer());
        laptopDto.setPrice(laptop.getPrice());
        laptopDto.setQuantityStock(laptop.getQuantityStock());

        laptopDto.setInches(laptop.getInches());

        return laptopDto;
    }
}
