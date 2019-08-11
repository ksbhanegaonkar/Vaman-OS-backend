package com.vamanos.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ContextMenuList {
	//Map<String,List<String>> allMenuList = new HashMap<String, List<String>>();
	List<String> allMenuList = new ArrayList<String>();
	
	public ContextMenuList() {
		// TODO Auto-generated constructor stub

		allMenuList.add("menu1");
		allMenuList.add("menu2");
		allMenuList.add("menu3");
		allMenuList.add("menu4");
		allMenuList.add("menu5");
		
	}

	public List<String> getAllMenuList() {
		return allMenuList;
	}

	public void setAllMenuList(List<String> allMenuList) {
		this.allMenuList = allMenuList;
	}


	
}
