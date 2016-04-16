package com.xiaokai.hello;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.representation.Variant;
import org.restlet.resource.Get;
import org.restlet.resource.Resource;
import org.restlet.resource.ServerResource;

/**
 * Created by player on 2016/4/16.
 */
public class HiRestlet  extends ServerResource {

    @Get
    @Override
    public String toString() {
        return "i don't like restlet...";
    }
}
