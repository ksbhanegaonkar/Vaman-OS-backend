package com.vamanos.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;

import com.vamanos.model.ContextMenuList;

@Path("services")
public class ContextMenuService {
	
    @GET
    @Path("getContextMenuList")
    @Produces(MediaType.APPLICATION_JSON)
    public ContextMenuList getContextMenuList() {
        return new ContextMenuList();
    }
}
