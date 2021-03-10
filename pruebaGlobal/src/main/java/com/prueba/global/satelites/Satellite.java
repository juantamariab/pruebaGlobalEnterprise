package com.prueba.global.satelites;

public class Satellite {
	
	private String name;
	private float coordenadaX;
	private float coordenadaY;
	private float positionsX;
	private float positionsY;
	private float distance;
	private String[] message;
	private String msg;
	
	
	public Satellite(String name, float positionsX, float positionsY) {
		super();
		this.name = name;
		this.positionsX = positionsX;
		this.positionsY = positionsY;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getCoordenadaX() {
		return coordenadaX;
	}


	public void setCoordenadaX(float coordenadaX) {
		this.coordenadaX = coordenadaX;
	}


	public float getCoordenadaY() {
		return coordenadaY;
	}


	public void setCoordenadaY(float coordenadaY) {
		this.coordenadaY = coordenadaY;
	}


	public float getPositionsX() {
		return positionsX;
	}


	public void setPositionsX(float positionsX) {
		this.positionsX = positionsX;
	}


	public float getPositionsY() {
		return positionsY;
	}


	public void setPositionsY(float positionsY) {
		this.positionsY = positionsY;
	}
	
	public float[] getLocation(float distance) {
		float[] cordenadas = new float[2];
		this.distance = distance;
		coordenadaX = (distance > 0) ? positionsX - distance : 0;
		coordenadaY = (distance > 0) ? positionsY - distance : 0;
		cordenadas[0] = coordenadaX;
		cordenadas[1] = coordenadaY;
		return cordenadas;
	}
	
	public String filterMessage(String[] messages) {
		String rpta = "";
		for(int i = 0; i < messages.length; i++) {
			rpta += (messages[i].equals("") || messages[i] == null)?" ":messages[i];
		}
		if(!rpta.isBlank()) {
			msg = rpta;
		}else {
			rpta = null;
			msg = null;
		}
		return rpta;
	}


	public float getDistance() {
		return distance;
	}


	public void setDistance(float distance) {
		this.distance = distance;
	}


	public String[] getMessage() {
		return message;
	}


	public void setMessage(String[] message) {
		this.message = message;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}	
	
	
}
