package com.sun.rest;

import com.sun.model.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;

/**
 * Created by Chris on 2016/8/19.
 */
public interface RestService {
    @GET
    @Path("/persons")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAll();

    @GET
    @Path("/person/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPersonById(@PathParam("id") int id);

    @GET
    @Path("/persons")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPersonsByGender(@QueryParam("gender") String gender);

    @POST
    @Path("/person")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Person create(Person person);

    @PUT
    @Path("/person/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Person update(@PathParam("id") int id, Map<String,Object> fieldMap);

    @DELETE
    @Path("/person/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person delete(@PathParam("id") int id);
}
