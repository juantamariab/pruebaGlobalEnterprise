package com.prueba.global.satelites;

public class Skywalker extends Satellite{

	private static final String[] MSG_ARRAY_DEFAULT = {"este ", "", "un ","mensaje"};
	
	public Skywalker() {
		super("Skywalker", 100f, -100f);
	}
	
	public String[] getMsgArrayDefault() {
		return MSG_ARRAY_DEFAULT;
	}
	
	
}
