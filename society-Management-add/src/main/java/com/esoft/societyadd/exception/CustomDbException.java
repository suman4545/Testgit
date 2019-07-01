package com.esoft.societyadd.exception;

public class CustomDbException extends Exception{
		
		private Object obj;
		private String msg;
		public CustomDbException() {
			super();
		}
		
		public CustomDbException(String msg,Object obj) {
			super();
			this.obj=obj;
			this.msg=msg;

	}

		public Object getObj() {
			return obj;
		}

		public void setObj(Object obj) {
			this.obj = obj;
		}

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		
		

}
