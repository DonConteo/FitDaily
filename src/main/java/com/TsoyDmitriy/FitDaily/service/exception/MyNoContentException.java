package com.TsoyDmitriy.FitDaily.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class MyNoContentException extends RuntimeException {

    public MyNoContentException(String message){
        super(message);
    }
}
