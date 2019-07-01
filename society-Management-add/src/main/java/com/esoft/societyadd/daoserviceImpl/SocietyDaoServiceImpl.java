package com.esoft.societyadd.daoserviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.esoft.societyadd.daoservice.SocietyRepository;
import com.esoft.societyadd.exception.CustomDbException;
import com.esoft.societyadd.models.Society;
import com.esoft.societyadd.responseCreate.Response;
import com.esoft.societyadd.responseCreate.ResponseCreate;
@Service

public class SocietyDaoServiceImpl {
	@Autowired
	SocietyRepository societyRepository;
	@Autowired
	ResponseCreate responseCreate;
	
	
	public Response saveSocietyData(Society society) throws CustomDbException {
		Response Sucessresponse = null;
		try {
			Society savedData=societyRepository.save(society);
			Map<String, Object>sucessMap=responseCreate.buildResponseSucess(society);
			Sucessresponse=responseCreate.createResponse(sucessMap);
			 
		} catch (DataAccessException e) {
			throw new CustomDbException("DataBase Error while executing the Query",e);
		}
		
		return Sucessresponse;
		
	 }
	
	
	
	
	
	
	

}
