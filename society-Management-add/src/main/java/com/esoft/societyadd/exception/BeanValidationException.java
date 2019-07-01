package com.esoft.societyadd.exception;

public class BeanValidationException extends Exception{
	
	private Object obj;
	public BeanValidationException() {
		super();
	}
	
	public BeanValidationException(Object obj) {
		super();
		this.setObj(obj);

}


	public Object getObj() {
		return obj;
	}



	public void setObj(Object obj) {
		this.obj = obj;
	}
}