package com.vamanos.model;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.vamanos.util.DesktopItemViewUtil;

public class DesktopItemView {
	Map<String,Object> desktopItemView = new HashMap<>();
	DesktopItemViewUtil desktopItemViewUtil = new DesktopItemViewUtil();
	public DesktopItemView() {
		
	}

	public String getDesktopItemView(String item) {
	    GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    desktopItemView = desktopItemViewUtil.getDesktopItemViewInfo(item);
		return gson.toJson(desktopItemView);
	}


	

	
	
}
