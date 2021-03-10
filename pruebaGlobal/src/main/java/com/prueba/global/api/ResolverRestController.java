package com.prueba.global.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.global.satelites.Kenobi;
import com.prueba.global.satelites.Skywalker;
import com.prueba.global.satelites.Solo;
import com.prueba.global.util.ResponseJson;
import com.prueba.global.util.SatellitesFrom;
import com.prueba.global.util.StatusCode;

@RestController
public class ResolverRestController {
	
	@CrossOrigin
	@RequestMapping(path = "/topsecret/" , method = RequestMethod.POST)
	public List<ResponseJson> topSecret(@RequestBody SatellitesFrom satellites){
		return satellites.validateInfomation(satellites.getSatelites());
	}
	
	@CrossOrigin
	@RequestMapping(path = "/topsecretsplit/{satelliteName}/{distance}" , method = {RequestMethod.GET, RequestMethod.POST})
	public List<ResponseJson> topSecretsplit(@PathVariable String satelliteName, @PathVariable float distance){
		SatellitesFrom sf = new SatellitesFrom();
		switch(satelliteName) {
			case"Kenobi":
				Kenobi k = new Kenobi();
				k.setDistance(distance);
				k.setMessage(k.getMsgArrayDefault());
				sf.getSatelites().add(k);
				break;
			case"Skywalker":
				Skywalker sk = new Skywalker();
				sk.setDistance(distance);
				sk.setMessage(sk.getMsgArrayDefault());
				sf.getSatelites().add(sk);
				break;
			case"Solo":
				Solo s = new Solo();
				s.setDistance(distance);
				s.setMessage(s.getMsgArrayDefault());
				sf.getSatelites().add(s);
				break;
			default:
				List<ResponseJson>jsonList = new ArrayList<ResponseJson>();
				ResponseJson json = new ResponseJson();
				json.setStatus(StatusCode.NOT_FOUND.getCode());
				json.setMessage("SATELLITE DESCONOCIDO!");
				jsonList.add(json);
				return jsonList;
				
				
		}
		return sf.validateInfomation(sf.getSatelites());
	}
	
	@CrossOrigin
	@RequestMapping("/prueba")
	public SatellitesFrom getPrueba() {
		ResponseJson json = new ResponseJson();
		json.setStatus(StatusCode.SUCCES.getCode());
		SatellitesFrom sf = new SatellitesFrom();
		return sf;
	}
	

}
