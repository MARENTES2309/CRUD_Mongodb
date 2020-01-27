package com.example.crud_mongodb;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class Conexion_mongodb {
    public static void  main(String[] args)
    {
        System.out.print("Probando conexion....");
        MongoClient mongo = null;
        try
        {
            mongo = new MongoClient("localhost",27027);
        }catch (UnknownError e){
            e.printStackTrace();
        }
        if (mongo != null)
        {
            DB db = mongo.getDB("Usuario");
        }
    }
}
