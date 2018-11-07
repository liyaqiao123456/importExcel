package com.neo.util;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Administrator on 2017/12/14.
 */
public class JsonUtil {

    public static String tojson(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
