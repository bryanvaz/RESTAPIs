package com.imitadvisory;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import com.imitadvisory.reqres.*;

public class Consumer {


    public static UserPage getUserPage(String targetUrl) {
        System.out.println("Getting Users from " + targetUrl);
        Client client = ClientBuilder.newClient();
        Response response = client.target(targetUrl).request().get();
        int status = response.getStatus();
        System.out.println("Status code: " + status);

        UserPage users = response.readEntity(UserPage.class);

        response.close();
        client.close();

        return users;
    }

    public static PostUserResponse createUser(PostUser user, String targetUrl){
        System.out.println("Creating new user: " + user);
        Client client = ClientBuilder.newClient();
        Response response = client.target(targetUrl).request()
                .post(Entity.entity(user, MediaType.APPLICATION_JSON_TYPE));
        int status = response.getStatus();
        System.out.println("Status code: " + status);
        PostUserResponse createdUser = response.readEntity(PostUserResponse.class);

        response.close();
        client.close();

        return createdUser;
    }
}
