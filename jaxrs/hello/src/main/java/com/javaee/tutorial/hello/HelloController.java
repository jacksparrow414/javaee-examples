package com.javaee.tutorial.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/init")
public class HelloController {

    @GET
    @Produces(value = MediaType.TEXT_PLAIN)
    public String info() {
        return "This is Get Method";
    }
}
