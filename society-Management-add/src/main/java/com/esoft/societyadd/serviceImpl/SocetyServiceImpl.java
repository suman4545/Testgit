package com.esoft.societyadd.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esoft.societyadd.beanValidatorService.SocietyBeanValidator;
import com.esoft.societyadd.daoserviceImpl.SocietyDaoServiceImpl;
import com.esoft.societyadd.exception.BeanValidationException;
import com.esoft.societyadd.exception.CustomDbException;
import com.esoft.societyadd.models.Society;
import com.esoft.societyadd.responseCreate.Response;
import com.esoft.societyadd.responseCreate.ResponseCreate;

@Service
public class SocetyServiceImpl {
	@Autowired
	SocietyDaoServiceImpl societyDao;
	@Autowired
	SocietyBeanValidator validator;
	
	
	
	public Response saveSociertyData(Society society) throws BeanValidationException, CustomDbException
	{
		
		validator.SocietyValidator(society);	
		return societyDao.saveSocietyData(society);
		
		
	}

}
