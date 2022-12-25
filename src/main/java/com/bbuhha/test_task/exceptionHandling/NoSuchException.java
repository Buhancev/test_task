package com.bbuhha.test_task.exceptionHandling;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class NoSuchException extends RuntimeException {
    private String info;

    public NoSuchException(String message) {
        super(message);
    }
}
