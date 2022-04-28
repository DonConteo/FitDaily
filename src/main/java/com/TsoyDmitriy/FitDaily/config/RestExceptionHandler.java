package com.TsoyDmitriy.FitDaily.config;

import com.TsoyDmitriy.FitDaily.service.exception.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Collections;
import java.util.Map;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(MyExpectationFailedException.class)
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    public Map<String, String> handleCustomException(MyExpectationFailedException ex) {
        return Collections.singletonMap("message", ex.getMessage());
    }

    @ExceptionHandler(MyNoContentException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Map<String, String> handleCustomException(MyNoContentException ex) {
        return Collections.singletonMap("message", ex.getMessage());
    }

    @ExceptionHandler(MyNotAcceptableException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public Map<String, String> handleCustomException(MyNotAcceptableException ex) {
        return Collections.singletonMap("message", ex.getMessage());
    }

    @ExceptionHandler(MyNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> handleCustomException(MyNotFoundException ex) {
        return Collections.singletonMap("message", ex.getMessage());
    }

    @ExceptionHandler(MyConflictException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public Map<String, String> handleCustomException(MyConflictException ex) {
        return Collections.singletonMap("message", ex.getMessage());
    }

    @ExceptionHandler(MyForbiddenException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public Map<String, String> handleCustomException(MyForbiddenException ex) {
        return Collections.singletonMap("message", ex.getMessage());
    }

    @ExceptionHandler(MyBadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleCustomException(MyBadRequestException ex) {
        return Collections.singletonMap("message", ex.getMessage());
    }

    @ExceptionHandler(MyInternalServerErrorException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, String> handleCustomException(MyInternalServerErrorException ex) {
        return Collections.singletonMap("message", ex.getMessage());
    }

    @ExceptionHandler(MyLockedException.class)
    @ResponseStatus(HttpStatus.LOCKED)
    public Map<String, String> handleCustomException(MyLockedException ex) {
        return Collections.singletonMap("message", ex.getMessage());
    }

    @SneakyThrows
    @ExceptionHandler(HttpClientErrorException.Conflict.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public Map<String, String> handleCustomException(HttpClientErrorException.Conflict ex) {
        ObjectNode message = new ObjectMapper().readValue(ex.getResponseBodyAsString(), ObjectNode.class);
        return Collections.singletonMap("message", message.get("message").textValue());
    }

    @SneakyThrows
    @ExceptionHandler(HttpClientErrorException.Unauthorized.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public void handleCustomException() {
    }
}
