package com.mongodb;

import spark.Spark;

/**
 * Created by root on 29/5/15.
 */
public class HelloWorldSparkStyle {

    public static void main(String[] args){

        Spark.get("/",(req,res)->"Hello world");
    }
}
