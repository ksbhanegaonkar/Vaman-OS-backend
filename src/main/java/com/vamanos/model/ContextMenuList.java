package com.vamanos.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@XmlRootElement
public class ContextMenuList {
	//Map<String,List<String>> allMenuList = new HashMap<String, List<String>>();
	Map<String,List<String>> allMenuList = new HashMap<String, List<String>>();
	
	public ContextMenuList() {
		// TODO Auto-generated constructor stub
		List<String> desktopWallpaperMenuList = new ArrayList<>();
		desktopWallpaperMenuList.add("menu1");
		desktopWallpaperMenuList.add("menu2");
		desktopWallpaperMenuList.add("menu3");
		desktopWallpaperMenuList.add("menu4");
		desktopWallpaperMenuList.add("menu5");
		
		List<String> startButtonContextMenuList = new ArrayList<>();
		startButtonContextMenuList.add("Start menu1");
		startButtonContextMenuList.add("Start menu2");
		startButtonContextMenuList.add("Start menu3");
		startButtonContextMenuList.add("Start menu4");
		startButtonContextMenuList.add("Start menu5");
		startButtonContextMenuList.add("Start menu5");
		startButtonContextMenuList.add("Start menu5");
		startButtonContextMenuList.add("Start menu5");
		startButtonContextMenuList.add("Start menu5");
		startButtonContextMenuList.add("Start menu5");
		startButtonContextMenuList.add("Start menu5");
		startButtonContextMenuList.add("Start menu5");
		startButtonContextMenuList.add("Start menu5");
		startButtonContextMenuList.add("Start menu5");
		startButtonContextMenuList.add("Start menu5");
		startButtonContextMenuList.add("Start menu5");
		startButtonContextMenuList.add("Start menu5");
		startButtonContextMenuList.add("Start menu5");
		startButtonContextMenuList.add("Start menu5");
		allMenuList.put("desktop-wallpaper", desktopWallpaperMenuList);
		allMenuList.put("start-button-menu", startButtonContextMenuList);
		
	}

	public String getAllMenuList() {
	    GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
		return gson.toJson(allMenuList);
	}

	public void setAllMenuList(Map<String, List<String>> allMenuList) {
		this.allMenuList = allMenuList;
	}
	
	
	
}
