package br.com.helpdesk.userserviceapi.controller;


import jakarta.servlet.http.HttpServletRequest;
import models.exceptions.ResourceNotFoundException;
import models.exceptions.StandardError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> handleNotFoundException(final ResourceNotFoundException resourceNotFoundException, final HttpServletRequest httpServletRequest){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(StandardError.builder()
                .timestamp(LocalDateTime.now())
                .error("Entity not found")
                .message(resourceNotFoundException.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .path(httpServletRequest.getRequestURI())
                .build());

    }
}
