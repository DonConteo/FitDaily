package com.TsoyDmitriy.FitDaily.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class MyConflictException extends RuntimeException{

    public MyConflictException(String message){
        super(message);
    }
}
