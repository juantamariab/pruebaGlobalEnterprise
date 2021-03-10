package com.prueba.global.satelites;

public class Kenobi extends Satellite{
	
	private static final String[] MSG_ARRAY_DEFAULT = {"","este ", "es ", "un ","mensaje"};
	
	public Kenobi() {
		super("Kenobi", -500f, -200f);
	}

	public String[] getMsgArrayDefault() {
		return MSG_ARRAY_DEFAULT;
	}
	
	

}
