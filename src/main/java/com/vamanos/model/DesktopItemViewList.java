package com.vamanos.model;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public class DesktopItemViewList {
	Map<String,String> desktopItemViewList = new HashMap<>();
	
	public DesktopItemViewList() {
		//desktopItemViewList.put("MyFile.txt", "file");
	}

	public JsonElement getDesktopItemViewList() {
	    GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
		return gson.toJsonTree(desktopItemViewList);
	}

	public void setDesktopItemViewList(Map<String, String> desktopItemViewList) {
		this.desktopItemViewList = desktopItemViewList;
	}
	
	public void addDesktopItemView(String string) {
		desktopItemViewList.put(string, "file");
	}
	
	public void removeDesktopItemView(String string) {
		desktopItemViewList.remove(string);
	}
	
	
}
