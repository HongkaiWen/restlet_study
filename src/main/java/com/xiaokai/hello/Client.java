package com.xiaokai.hello;

import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

import java.io.IOException;

/**
 * Created by player on 2016/4/16.
 */
public class Client {
    public static void main(String args[]) throws IOException {
        String url = "http://localhost:7000";
        ClientResource clientResource = new ClientResource(url);
        Representation respresentation = clientResource.get();
        System.out.println(respresentation.getText());
    }
}
