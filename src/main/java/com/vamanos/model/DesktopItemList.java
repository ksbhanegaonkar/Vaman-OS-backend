package com.vamanos.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public class DesktopItemList {
	Map<String,String> desktopItemList = new HashMap<>();
	
	public DesktopItemList() {
		desktopItemList.put("MyFile.txt", "file");
		desktopItemList.put("MyFile2.txt", "file");
		desktopItemList.put("MyFolder1", "folder");
		desktopItemList.put("MyFolder2", "folder");
		desktopItemList.put("VamanOS", "file");
		desktopItemList.put("KedarsFile.txt", "file");
		
		for(int i=0;i<20;i++) {
			desktopItemList.put("MyFolder2"+i, "folder");
		}
	}

	public JsonElement getDesktopItemList() {
	    GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
		return gson.toJsonTree(desktopItemList);
	}

	public void setDesktopItemList(Map<String, String> desktopItemList) {
		this.desktopItemList = desktopItemList;
	}
}
