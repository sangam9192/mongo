package com.mongodb;

import freemarker.template.Configuration;
import freemarker.template.Template;
import spark.Spark;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.halt;

/**
 * Created by root on 1/6/15.
 */
public class HelloWorldSparkFreeMarkerStyle {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(HelloWorldSparkFreeMarkerStyle.class, "/");
        Spark.get("/", (req, res) -> {
            StringWriter writer = new StringWriter();
            try {
                Template helloTemplate = configuration.getTemplate("hello.ftl");

                Map<String,Object> map = new HashMap<String,Object>();
                map.put("name","Sangam");
                helloTemplate.process(map, writer);

            } catch (Exception e) {
                halt(500);
                e.printStackTrace();
            }
        return writer;
        });

    }

}
