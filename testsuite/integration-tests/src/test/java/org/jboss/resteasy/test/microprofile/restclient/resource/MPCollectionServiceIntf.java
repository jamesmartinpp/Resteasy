package org.jboss.resteasy.test.microprofile.restclient.resource;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@RegisterRestClient(baseUri ="http://localhost:8080/war_service")
@Path("/theService")
@Singleton
public interface MPCollectionServiceIntf {
    @GET
    @Path("get")
    List<String> getList();

    @GET
    @Path("ping")
    String ping();
}
