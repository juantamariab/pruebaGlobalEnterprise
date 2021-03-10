package com.prueba.global.util;

public enum StatusCode {
	
	CONTINUE(100,"Continue"),
	SUCCES(200,"Ok"),
	BAD_REQUEST(400,"Bat Request"),
	UNAUTHORIZE(401,"Unauthorized"),
	FORBIDDENT(403,"Forbiddent"),
	NOT_FOUND(404,"Not Found"),
	CONFLICT(409,"Conflict"),
	INTERNAL_SERVER_ERROR(500,"Internal Server Error");
	
	private Integer code;
	private String label;
	
	private StatusCode(Integer code, String label) {
		this.code = code;
		this.label = label;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	
	
	
	
	

}
