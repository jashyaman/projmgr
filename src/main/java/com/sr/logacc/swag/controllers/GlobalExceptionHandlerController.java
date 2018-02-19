package com.sr.logacc.swag.controllers;

import java.io.IOException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.sr.logacc.swag.exceptions.UserNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandlerController extends ResponseEntityExceptionHandler{

	@ExceptionHandler({ UserNotFoundException.class })
    public ResponseEntity<Object> handleUserNotFoundException(Exception ex, WebRequest request) {
        return new ResponseEntity<Object>(
          ex.getMessage(), new HttpHeaders(), HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler({ ResourceNotFoundException.class })
    public ResponseEntity<Object> handleResourceNotFoundException(Exception ex, WebRequest request) {
        return new ResponseEntity<Object>(
          ex.getMessage(), new HttpHeaders(), HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler({ JsonParseException.class })
    public ResponseEntity<Object> handleJsonParseException(Exception ex, WebRequest request) {
        return new ResponseEntity<Object>(
          ex.getMessage(), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
	
	@ExceptionHandler({ JsonMappingException.class })
    public ResponseEntity<Object> handleJsonMappingException(Exception ex, WebRequest request) {
        return new ResponseEntity<Object>(
          ex.getMessage(), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
	
	@ExceptionHandler({ IOException.class })
    public ResponseEntity<Object> handleIOException(Exception ex, WebRequest request) {
        return new ResponseEntity<Object>(
          ex.getMessage(), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
	
	
	@ExceptionHandler({ IndexOutOfBoundsException.class })
    public ResponseEntity<Object> indexOutOfBoundsException(Exception ex, WebRequest request) {
        return new ResponseEntity<Object>(
          ex.getMessage()+" index out of bounds", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
