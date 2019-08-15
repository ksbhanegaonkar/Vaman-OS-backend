package com.vamanos.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.vamanos.model.ContextMenuList;
import com.vamanos.model.DesktopItemList;
import com.vamanos.model.StartMenuList;

public class DesktopUpdateUtil {
	public String updateDesktop(String state) {
		
		JsonParser jsonParser = new JsonParser();
		JsonObject obj = (JsonObject) jsonParser.parse(state);
		
		obj.add("start-menu-list", new StartMenuList().getStartMenuList());
		obj.add("context-menu-list", new ContextMenuList().getcontextMenuList());
		obj.add("desktop-items", new DesktopItemList().getDesktopItemList());
		
		System.out.println(obj);
		return obj.toString();
	}
}
