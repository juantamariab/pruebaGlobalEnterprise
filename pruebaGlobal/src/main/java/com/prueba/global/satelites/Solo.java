package com.prueba.global.satelites;

public class Solo extends Satellite{
	
	private static final String[] MSG_ARRAY_DEFAULT = {"", "es ", "","mensaje"};
	
	public Solo() {
		super("Solo", 500f,100f);
		// TODO Auto-generated constructor stub
	}
	
	public String[] getMsgArrayDefault() {
		return MSG_ARRAY_DEFAULT;
	}

}
