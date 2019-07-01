package com.esoft.societyadd.responseCreate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.esoft.societyadd.models.Society;

@Service
public class ResponseCreate {
	
	
	
	
	public Map<String, Object> buildResponseSucess(Society society) {
		Map<String, Object> responseMap=new HashMap<String,Object>();
		responseMap.put("reg_no",society.getSocietyRegNo());
		responseMap.put("status","SUCESS");
		return responseMap;
	
		
	}
	
	
	public Map<String, Object> buildResponseFailure(Society society) {
		Map<String, Object> responseMap=new HashMap<String,Object>();
		responseMap.put("reg_no",society.getSocietyRegNo());
		responseMap.put("status","Failue");
		return responseMap;
	
		
	}
	
	
	
	
	public Response createResponse(Map<String,Object> respMap) {
		Response response=new Response();
		response.setSociety_reg(String.valueOf(respMap.get("reg_no")));
		response.setStatus(String.valueOf(respMap.get("status")));
		if(response.getStatus().equals("SUCESS")) {
			response.setStatusId(0);
		}
		else {
			response.setStatusId(999);
			List<ErrorList>errors=(List<ErrorList>) respMap.get("errorList");
			response.setErrorList(errors);
			}
		
		return response;
		
		
		
	}

}
