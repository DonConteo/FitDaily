package com.TsoyDmitriy.FitDaily.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class MyNotAcceptableException extends RuntimeException{

    public MyNotAcceptableException(String message){
        super(message);
    }
}
