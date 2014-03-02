package com.biying.lottery.services;

import java.util.HashMap;
import java.util.Map;

import android.util.Log;

public class BaseRequest {
	private HashMap<String, String> properties;
	
	public void setProperty(String name, String value){
		properties.put(name, value);
	}
	
	public String getProperty(String name){
		return properties.get(name);
	}
	
	public String makeRequest()
	{
		for (Map.Entry<String, String> entry: properties.entrySet()) {
			Log.d("MAP", entry.getValue());
		}
		return "";
	}
}
