package com.attlas.api.v1;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.*;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PATCH;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.PathSegment;

import org.apache.log4j.Logger;

import com.attlas.api.ApiResponse;
import com.attlas.api.Goals;
import com.attlas.api.GoalInfo;

/**
 * 
 */
@Path("api/v1/goals")
public class GoalsResource {

  private static final Logger logger = Logger.getLogger(GoalsResource.class);

  /**
   * Create goal
   */
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Response createGoal(@Context UriInfo uriInfo, GoalInfo goalInfo) {
    logger.info(uriInfo.getRequestUri());
    return Response.status(Response.Status.CREATED).entity(ApiResponse.build(Goals.add(goalInfo))).build();
  }

}
