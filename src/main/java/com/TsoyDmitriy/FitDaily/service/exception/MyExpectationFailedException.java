package com.TsoyDmitriy.FitDaily.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
public class MyExpectationFailedException extends RuntimeException{

    public MyExpectationFailedException(String message){
        super(message);
    }
}
