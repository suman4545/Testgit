package com.esoft.societyadd.responseCreate;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Response {
	
	private String status;
	
	private int statusId;
	private String society_reg;
	private List<ErrorList>errorList;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public String getSociety_reg() {
		return society_reg;
	}
	public void setSociety_reg(String society_reg) {
		this.society_reg = society_reg;
	}
	public List<ErrorList> getErrorList() {
		return errorList;
	}
	public void setErrorList(List<ErrorList> errorList) {
		this.errorList = errorList;
	}
	
	
	
	

}
