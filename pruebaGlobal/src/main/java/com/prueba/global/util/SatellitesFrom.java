package com.prueba.global.util;

import java.util.ArrayList;
import java.util.List;

import com.prueba.global.satelites.Kenobi;
import com.prueba.global.satelites.Satellite;
import com.prueba.global.satelites.Skywalker;
import com.prueba.global.satelites.Solo;

public class SatellitesFrom {
	
	private List<Satellite> satellites;

	public SatellitesFrom() {
		satellites = new ArrayList<Satellite>();
	}

	public List<Satellite> getSatelites() {
		return satellites;
	}

	public void setSatelites(List<Satellite> satellites) {
		this.satellites = satellites;
	}
	
	public List<ResponseJson> validateInfomation(List<Satellite> list) {
		List<ResponseJson> jsonList = new ArrayList<ResponseJson>();
		list.forEach(s ->{
			if(s.getName() != null) {
				if(s.getName().equals("Kenobi")) {
					Kenobi k = new Kenobi();
					ResponseJson json = new ResponseJson();
					json.setStatus(StatusCode.SUCCES.getCode());
					k.getLocation(s.getDistance());
					k.filterMessage(s.getMessage());
					json.setMessage(k.getMsg());
					if(k.getMsg() == null && (k.getCoordenadaX() == 0 && k.getCoordenadaY() == 0)) {
						json.setMessage("No se pudo determinar el Mensaje ni la posición");
					}else if(k.getMsg() == null) {
						json.setMessage("No se pudo determinar el Mensaje!");
						json.setStatus(StatusCode.NOT_FOUND.getCode());
					}else if(k.getCoordenadaX() == 0 && k.getCoordenadaY() == 0) {
						json.setMessage("No se pudo determinar la posición!");
						json.setStatus(StatusCode.NOT_FOUND.getCode());
					}
					json.setObject((json.getStatus() == 200) ? k : null);
					json.setValue((json.getObject() != null) ? null : k.getName());
					jsonList.add(json);
					
				}else if(s.getName().equals("Skywalker")) {
					Skywalker sk = new Skywalker();
					ResponseJson json = new ResponseJson();
					json.setStatus(StatusCode.SUCCES.getCode());
					sk.getLocation(s.getDistance());
					sk.filterMessage(s.getMessage());
					json.setMessage(sk.getMsg());
					if(sk.getMsg() == null && (sk.getCoordenadaX() == 0 && sk.getCoordenadaY() == 0)) {
						json.setMessage("No se pudo determinar el Mensaje ni la posición");
					}else if(sk.getMsg() == null) {
						json.setMessage("No se pudo determinar el Mensaje!");
						json.setStatus(StatusCode.NOT_FOUND.getCode());
					}else if(sk.getCoordenadaX() == 0 && sk.getCoordenadaY() == 0) {
						json.setMessage("No se pudo determinar la posición!");
						json.setStatus(StatusCode.NOT_FOUND.getCode());
					}
					json.setObject((json.getStatus() == 200) ? sk : null);
					json.setValue((json.getObject() != null) ? null : sk.getName());
					jsonList.add(json);
				}else if(s.getName().equals("Solo")){
					Solo so = new Solo();
					ResponseJson json = new ResponseJson();
					json.setStatus(StatusCode.SUCCES.getCode());
					so.getLocation(s.getDistance());
					so.filterMessage(s.getMessage());
					json.setMessage(so.getMsg());
					json.setMessage(so.getMsg());
					if(so.getMsg() ==null && (so.getCoordenadaX() == 0 && so.getCoordenadaY() == 0)) {
						json.setMessage("No se pudo determinar el Mensaje ni la posición");
					}else if(so.getMsg() == null) {
						json.setMessage("No se pudo determinar el Mensaje!");
						json.setStatus(StatusCode.NOT_FOUND.getCode());
					}else if(so.getCoordenadaX() == 0 && so.getCoordenadaY() == 0) {
						json.setMessage("No se pudo determinar la posición!");
						json.setStatus(StatusCode.NOT_FOUND.getCode());
					}
					json.setObject((json.getStatus() == 200) ? so : null);
					json.setValue((json.getObject() != null) ? null : so.getName());
					jsonList.add(json);
				}else {
					ResponseJson json = new ResponseJson();
					json.setStatus(StatusCode.CONFLICT.getCode());
					json.setMessage("Satellite Desconocido!");
					jsonList.add(json);
				}
			}else{
				ResponseJson json = new ResponseJson();
				json.setStatus(StatusCode.INTERNAL_SERVER_ERROR.getCode());
				json.setMessage(StatusCode.INTERNAL_SERVER_ERROR.getLabel());
			}
		});
		return jsonList;
	}
	
}
