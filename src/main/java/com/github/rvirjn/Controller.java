package com.github.rvirjn;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.BufferedReader;
import java.io.FileReader;
import com.github.rvirjn.Credential;

public class Controller {
    public static void main(String[] args) throws Exception{
        new Controller ().run();
    }

    public JsonReader run() throws Exception{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonReader reader = new JsonReader(new BufferedReader(new FileReader("src/test/resources/input.json")));
        final Credential[] credentials = gson.fromJson(reader, Credential[].class);
        
        for(Credential cr : credentials) {
        	System.out.println(cr.getCredentialId());
        	System.out.println(cr.getHostDNSName());
        }
        return reader;
    }
}

