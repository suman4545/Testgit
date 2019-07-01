package com.esoft.societyadd.exception;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.esoft.societyadd.responseCreate.Response;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(BeanValidationException.class)
	public ResponseEntity<Response> handleBeanError(BeanValidationException er) {
		
		Response res=(Response) er.getObj();
		return new ResponseEntity<Response>(res, HttpStatus.EXPECTATION_FAILED);
	}
	
	@ExceptionHandler(CustomDbException.class)
	public ResponseEntity<HashMap<String,String>> handleDBError(CustomDbException er) {
		
		String res=er.getMsg();
		HashMap<String,String>map=new HashMap<>();
		map.put("Errordetails", res);
		return new ResponseEntity<HashMap<String,String>>(map, HttpStatus.CONFLICT);
	}
	
	

}
