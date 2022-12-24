package com.bbuhha.test_task.dto;

import com.bbuhha.test_task.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class BaseEntityDto {
    protected Long id;

    @NotEmpty
    protected String serialNumber;

    @NotEmpty
    protected String manufacturer;

    @NotNull
    protected int amount;

    public BaseEntity toEntity(){
        BaseEntity baseEntity = new BaseEntity();

        baseEntity.setId(id);
        baseEntity.setSerialNumber(serialNumber);
        baseEntity.setManufacturer(manufacturer);
        baseEntity.setAmount(amount);

        return baseEntity;
    }

    public static BaseEntityDto fromEntity(BaseEntity baseEntity) {
        BaseEntityDto baseEntityDto = new BaseEntityDto();

        baseEntityDto.setSerialNumber(baseEntity.getSerialNumber());
        baseEntityDto.setManufacturer(baseEntity.getManufacturer());
        baseEntityDto.setAmount(baseEntity.getAmount());

        return baseEntityDto;
    }
}
