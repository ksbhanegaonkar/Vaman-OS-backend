package com.vamanos.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.vamanos.model.ContextMenuList;
import com.vamanos.model.DesktopItemList;
import com.vamanos.model.DesktopItemViewList;
import com.vamanos.model.StartMenuList;

public class DesktopUpdateUtil {
	StartMenuList startMenuList = null;
	ContextMenuList contextMenuList = null;
	DesktopItemList desktopItemList = null;
	DesktopItemViewList desktopItemViewList = null;
	
	public String updateDesktop(String state) {
		startMenuList = new StartMenuList();
		contextMenuList = new ContextMenuList();
		desktopItemList = new DesktopItemList();
		desktopItemViewList = new DesktopItemViewList();
		JsonParser jsonParser = new JsonParser();
		JsonObject obj = (JsonObject) jsonParser.parse(state);
		JsonObject newState = new JsonObject();
		if("init".equals(obj.get("state").getAsString())) {
			newState.add("startMenuOption", startMenuList.getStartMenuList());
			newState.add("contextMenuOption", contextMenuList.getcontextMenuList());
			newState.add("desktopItems", desktopItemList.getDesktopItemList());
			newState.add("desktopItemViews", desktopItemViewList.getDesktopItemViewList());
		}
		else if("update".equals(obj.get("state").getAsString())){
				if("on-double-click".equals(obj.get("action").getAsString())) {
					desktopItemViewList.addDesktopItemView(obj.get("desktopItem").getAsString());
					newState.add("desktopItemViews", desktopItemViewList.getDesktopItemViewList());
				}
				else if("on-close".equals(obj.get("action").getAsString())) {
					desktopItemViewList.removeDesktopItemView(obj.get("desktopItem").getAsString());
					newState.add("desktopItemViews", desktopItemViewList.getDesktopItemViewList());
				}
		}

		
		System.out.println(newState);
		return newState.toString();
	}
}
