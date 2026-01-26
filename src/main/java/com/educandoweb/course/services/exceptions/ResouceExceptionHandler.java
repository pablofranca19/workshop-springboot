package com.educandoweb.course.services.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.educandoweb.course.resources.exceptions.StandardError;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResouceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> exceptionHandler (ResourceNotFoundException e, HttpServletRequest quest) {
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError standardError = new StandardError(Instant.now(), status.value(), error, e.getMessage(), quest.getRequestURI());
		
		return ResponseEntity.status(status).body(standardError);
	}
	
}
