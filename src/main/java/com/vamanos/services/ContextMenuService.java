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

@Path("services")
public class ContextMenuService {
	
    @GET
    @Path("getContextMenuList")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getContextMenuList() {
    	ResponseBuilder builder = Response.ok(new ContextMenuList().getAllMenuList());
    	Response response = builder.build();
        return response;
    }
    
    @POST
    @Path("onaction")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public Response onAction() {
    	System.out.println("On Action method called  !!");
    	ResponseBuilder builder = Response.ok(new ContextMenuList().getAllMenuList());
    	Response response = builder.build();
        return response;
    }
}
