package com.enigma.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequstException extends RuntimeException{

    public BadRequstException(String message) {
        super(message);
    }
}
