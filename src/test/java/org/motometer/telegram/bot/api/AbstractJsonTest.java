package org.motometer.telegram.bot.api;

import java.util.ServiceLoader;

import org.junit.jupiter.api.BeforeEach;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;

abstract class AbstractJsonTest {

    Gson gson;

    @BeforeEach
    void setUp() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        for (TypeAdapterFactory factory : ServiceLoader.load(TypeAdapterFactory.class)) {
            gsonBuilder.registerTypeAdapterFactory(factory);
        }

        gson = gsonBuilder.create();
    }
}
