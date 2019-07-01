package com.esoft.societyadd.beanValidatorService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esoft.societyadd.daoserviceImpl.SocietyDaoServiceImpl;
import com.esoft.societyadd.exception.BeanValidationException;
import com.esoft.societyadd.models.Society;
import com.esoft.societyadd.responseCreate.ErrorList;
import com.esoft.societyadd.responseCreate.Response;
import com.esoft.societyadd.responseCreate.ResponseCreate;
@Service
public class SocietyBeanValidator {
	@Autowired
	SocietyDaoServiceImpl societyDao;
	
	@Autowired
	ResponseCreate responseCreate;
	
	ValidatorFactory factory=null;
	Validator validator=null;
	
	public SocietyBeanValidator() {
         factory = Validation.buildDefaultValidatorFactory();
         validator = factory.getValidator();
	}
	
	
	public void SocietyValidator(Society society) throws BeanValidationException {
		Response failureRes = null;
		
        Set<ConstraintViolation<Society>> constraintViolations = validator.validate(society);

        if (constraintViolations.size() > 0) {
        	List<ErrorList>EL=new ArrayList<>();
            for (ConstraintViolation<Society> violation : constraintViolations) {
            	ErrorList err=new ErrorList();
            	err.setErrorCode(violation.getPropertyPath().toString());
            	err.setErrordet(violation.getMessage());
            	//System.out.println(violation.getMessage());
            	EL.add(err);
            }
            
            Map<String, Object>failureMap=responseCreate.buildResponseFailure(society);
            failureMap.put("errorList", EL);
            failureRes=responseCreate.createResponse(failureMap);
            throw new BeanValidationException(failureRes);
        } 
		 
	}
}
