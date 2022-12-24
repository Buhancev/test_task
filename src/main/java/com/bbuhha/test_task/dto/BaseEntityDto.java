package com.bbuhha.test_task.dto;

import com.bbuhha.test_task.model.BaseEntity;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
public class BaseEntityDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
