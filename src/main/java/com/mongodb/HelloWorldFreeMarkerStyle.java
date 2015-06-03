package com.mongodb;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 29/5/15.
 */
public class HelloWorldFreeMarkerStyle {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(HelloWorldFreeMarkerStyle.class,"/");
        try {
            Template helloTemplate = configuration.getTemplate("hello.ftl");
            StringWriter writer = new StringWriter();
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("name","Sangam");
            helloTemplate.process(map, writer);
            System.out.println(writer);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
