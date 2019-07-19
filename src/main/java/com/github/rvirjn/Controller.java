package com.github.rvirjn;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import com.github.rvirjn.Credential;

public class Controller {
    public static void main(String[] args) throws Exception{
        new Controller ().run();
    }

    public JsonReader run() throws Exception{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        final Credential[] credentials = gson.fromJson(getJson(), Credential[].class);
        JsonReader reader = new JsonReader(new BufferedReader(new FileReader("test/resources/input.json")));
        return reader;
    }
}

