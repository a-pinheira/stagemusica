package com.sony.codestage.controllers.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sony.codestage.controllers.services.exceptions.ResourceNotFoundExcpetion;

@ControllerAdvice
public class ResourceExceptionHandler {
	@ExceptionHandler(ResourceNotFoundExcpetion.class)
	public ResponseEntity<StandardError> resourceNotFound (ResourceNotFoundExcpetion e, HttpServletRequest request){
		String error = "Resource Not Found - Erro Teste";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError er = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(er);
	}

}
