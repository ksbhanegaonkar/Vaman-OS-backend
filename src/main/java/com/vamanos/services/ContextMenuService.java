package com.vamanos.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.vamanos.model.ContextMenuList;
import com.vamanos.model.DesktopItemList;
import com.vamanos.model.StartMenuList;
import com.vamanos.util.DesktopUpdateUtil;

@Path("services")
public class ContextMenuService {
	DesktopUpdateUtil DesktopUpdateUtil = new DesktopUpdateUtil();
	
    @POST
    @Path("onaction")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public Response onAction(String action) {
    	System.out.println("On Action method called  !!"+action);
    	ResponseBuilder builder = Response.ok(DesktopUpdateUtil.updateDesktop(action));
    	Response response = builder.build();
        return response;
    }
    
    
	/*
	 * @GET
	 * 
	 * @Path("getContextMenuList")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public Response getContextMenuList() {
	 * ResponseBuilder builder = Response.ok(new
	 * ContextMenuList().getcontextMenuList()); Response response = builder.build();
	 * return response; }
	 * 
	 * 
	 * @GET
	 * 
	 * @Path("getStartMenuList")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public Response getStartMenuList() {
	 * ResponseBuilder builder = Response.ok(new
	 * StartMenuList().getStartMenuList()); Response response = builder.build();
	 * return response; }
	 * 
	 * @GET
	 * 
	 * @Path("getDesktopItemList")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public Response getDesktopItemist() {
	 * ResponseBuilder builder = Response.ok(new
	 * DesktopItemList().getDesktopItemList()); Response response = builder.build();
	 * return response; }
	 */
    

}
