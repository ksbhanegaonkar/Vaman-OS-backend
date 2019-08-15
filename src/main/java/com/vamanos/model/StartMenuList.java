package com.vamanos.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public class StartMenuList {
	List<String> startMenuList = new ArrayList<String>();
	
	public StartMenuList() {
		
		startMenuList.add("My Folder");
		startMenuList.add("My Bookmarks");
		startMenuList.add("My Notes");
		startMenuList.add("Logout 1");
		
	}

	public JsonElement getStartMenuList() {
	    GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
		return gson.toJsonTree(startMenuList);
		
	}

	public void setStartMenuList(List<String> startMenuList) {
		this.startMenuList = startMenuList;
	}
	
	
	
}
