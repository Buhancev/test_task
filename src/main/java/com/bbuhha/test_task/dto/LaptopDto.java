package com.bbuhha.test_task.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class LaptopDto extends BaseEntityDto{
    @Min(13)
    @Max(17)
    private byte inches;

}
