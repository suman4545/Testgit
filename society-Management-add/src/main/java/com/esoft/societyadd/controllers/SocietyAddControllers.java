package com.esoft.societyadd.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esoft.societyadd.exception.BeanValidationException;
import com.esoft.societyadd.exception.CustomDbException;
import com.esoft.societyadd.models.Society;
import com.esoft.societyadd.responseCreate.Response;
import com.esoft.societyadd.serviceImpl.SocetyServiceImpl;

@RestController
public class SocietyAddControllers {
	@Autowired
	SocetyServiceImpl socetyServiceImpl;
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	
	@PostMapping(path="/savesociety", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response>saveSocietyData(RequestEntity<Society>rebody) throws BeanValidationException, CustomDbException{
		LOGGER.info("REQUEST FOR NEW Society:"+rebody.getBody());
		
		System.out.println("Hiiii");
		return new ResponseEntity<Response>(
				socetyServiceImpl.saveSociertyData(rebody.getBody())
				, HttpStatus.OK);
		
	}
	
	
	
	
	

}
