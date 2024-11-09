package com.jsp.studentmgt.exceptionHandle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class Exceptionhandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> nullpointer(NullPointerException e){
		return new ResponseEntity<String>("Invalid ID",HttpStatus.BAD_REQUEST );
	}

}
