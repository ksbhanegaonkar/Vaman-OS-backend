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
	
	/*
	 *     "desktop-wallpaper":['','','','','Cut',''],
      "start-menu-button":['Option 1','Option 2','Option 3','Option 4'],
      "task-bar":['','Option 6','Option 7','Option 8'],
      "desktop-item-folder":['','w','','','',''],
      "desktop-item-file":['','',','','','']
      ['','','','']
	 * */
	
	public ContextMenuList() {
		// TODO Auto-generated constructor stub
		List<String> desktopWallpaperMenuList = new ArrayList<>();
		desktopWallpaperMenuList.add("New Sprint");
		desktopWallpaperMenuList.add("New User Story");
		desktopWallpaperMenuList.add("Refresh");
		desktopWallpaperMenuList.add("Copy");
		desktopWallpaperMenuList.add("Paste");
		
		List<String> taskBarMenuList = new ArrayList<>();
		taskBarMenuList.add("Task bar option 1");
		taskBarMenuList.add("Task bar option 2");
		taskBarMenuList.add("Task bar option 3");
		taskBarMenuList.add("Task bar option 4");
		taskBarMenuList.add("Task bar option 5");
		
		List<String> desktopItemFolderMenuList = new ArrayList<>();
		desktopItemFolderMenuList.add("Open folder");
		desktopItemFolderMenuList.add("Open folder in new window");
		desktopItemFolderMenuList.add("Bookmark folder");
		desktopItemFolderMenuList.add("Copy Folder");
		desktopItemFolderMenuList.add("Rename Folder");
		desktopItemFolderMenuList.add("Delete Folder");
		

		
		List<String> desktopItemFileMenuList = new ArrayList<>();
		desktopItemFileMenuList.add("Open file");
		desktopItemFileMenuList.add("Open file in new window");
		desktopItemFileMenuList.add("Bookmark file");
		desktopItemFileMenuList.add("Copy file");
		desktopItemFileMenuList.add("Rename File");
		desktopItemFileMenuList.add("Delete file");
		
		List<String> startButtonContextMenuList = new ArrayList<>();
		startButtonContextMenuList.add("My Folder");
		startButtonContextMenuList.add("My Bookmarks");
		startButtonContextMenuList.add("My Notes");
		startButtonContextMenuList.add("Logout");

		
		List<String> startButtonMenuList = new ArrayList<>();
		startButtonMenuList.add("My Folder");
		startButtonMenuList.add("My Bookmarks");
		startButtonMenuList.add("My Notes");
		startButtonMenuList.add("Logout");

		allMenuList.put("desktop-wallpaper", desktopWallpaperMenuList);
		allMenuList.put("task-bar", taskBarMenuList);
		allMenuList.put("desktop-item-folder", desktopItemFolderMenuList);
		allMenuList.put("desktop-item-file", desktopItemFileMenuList);
		allMenuList.put("start-button-context-menu", startButtonContextMenuList);
		allMenuList.put("start-button-menu", startButtonMenuList);
		
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
