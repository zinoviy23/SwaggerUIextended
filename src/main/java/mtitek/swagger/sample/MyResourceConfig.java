package mtitek.swagger.sample;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ext.Provider;

@Provider
public class MyResourceConfig extends ResourceConfig {
    public MyResourceConfig() {
        packages(true, "mtitek.swagger.sample");
    }
}