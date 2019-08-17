package com.vamanos.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.vamanos.model.ContextMenuList;
import com.vamanos.model.DesktopItemList;
import com.vamanos.model.DesktopItemView;
import com.vamanos.model.StartMenuList;

public class DesktopUpdateUtil {
	StartMenuList startMenuList = null;
	ContextMenuList contextMenuList = null;
	DesktopItemList desktopItemList = null;
	DesktopItemView desktopItemView = null;
	
	public String updateDesktop(String state) {
		desktopItemView = new DesktopItemView();
		JsonParser jsonParser = new JsonParser();
		JsonObject obj = (JsonObject) jsonParser.parse(state);

		if("init".equals(obj.get("state").getAsString())) {
			JsonObject newState = new JsonObject();
			startMenuList = new StartMenuList();
			contextMenuList = new ContextMenuList();
			desktopItemList = new DesktopItemList();
			newState.add("startMenuOption", startMenuList.getStartMenuList());
			newState.add("contextMenuOption", contextMenuList.getcontextMenuList());
			newState.add("desktopItems", desktopItemList.getDesktopItemList());
			return newState.toString();
		}
		else if("update".equals(obj.get("state").getAsString())){
				if("on-double-click".equals(obj.get("action").getAsString())) {
					return desktopItemView.getDesktopItemView(obj.get("desktopItem").getAsString());
				}

		}

		return "{'empty':'empty'}";
	}
}
