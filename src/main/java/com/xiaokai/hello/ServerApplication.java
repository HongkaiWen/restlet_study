package com.xiaokai.hello;

import org.restlet.Application;
import org.restlet.Context;
import org.restlet.Server;
import org.restlet.data.Protocol;

/**
 * Created by player on 2016/4/16.
 */
public class ServerApplication extends Application {
    public static void main(String args[]) throws Exception {
        new Server(Context.getCurrent(), Protocol.HTTP, 7000, HiRestlet.class).start();
    }

    public ServerApplication(Context context){
        super(context);
    }

}
