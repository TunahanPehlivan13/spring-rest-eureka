package com.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ItemNotFoundException extends RuntimeException {

    public ItemNotFoundException() {
        super("item is not found!");
    }

    public ItemNotFoundException(Long number) {
        super(number + " is not found!");
    }
}
