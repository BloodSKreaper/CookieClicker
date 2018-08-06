package me.chrisochs.cookieclicker;

import java.util.UUID;

import playerdata.PlayerdataAPI;

public class playerdata {
	public playerdata(){}
	
	private String stdpath = "CookieClicker.";
	
	public String getString(UUID uuid, String path){
		return PlayerdataAPI.getString(uuid,stdpath+path);
	}
	
	public int getInt(UUID uuid, String path){
		return PlayerdataAPI.getInt(uuid, stdpath+path);
	}
	
	public boolean getBoolean(UUID uuid, String path){
		return PlayerdataAPI.getBoolean(uuid, stdpath+path);
	}
	
	public void set(UUID uuid, String path, Object value){
		PlayerdataAPI.set(uuid, stdpath+path, value);
	}
	
	
	public void setupPlayerConfig(UUID uuid){
		if(getString(uuid, stdpath.replaceAll(".", "")) == null){
			set(uuid, "amount", 0);
		}
	}
}