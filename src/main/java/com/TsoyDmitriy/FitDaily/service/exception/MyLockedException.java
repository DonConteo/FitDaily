package com.TsoyDmitriy.FitDaily.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.LOCKED)
public class MyLockedException extends RuntimeException {

    public MyLockedException(String message) {
        super(message);
    }
}

