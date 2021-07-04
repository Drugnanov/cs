package com.cs.svamk.core.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.io.IOException;

@RestControllerAdvice
@Slf4j
public class Advice {

    @ExceptionHandler(value = {IOException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public String resourceNotFoundException(IOException ex, WebRequest request) {
        log.warn(ex.getMessage(), ex);
        return ex.getMessage();
    }
}
