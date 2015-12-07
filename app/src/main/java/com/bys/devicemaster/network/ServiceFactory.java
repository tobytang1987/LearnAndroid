package com.bys.devicemaster.network;

import java.io.IOException;

import retrofit.Converter;
import retrofit.Retrofit;

/**
 * Created by tobytang on 12/7/15.
 */
public class ServiceFactory {

    private static final String BASE_URL = "http://10.48.18.52:3000";
    private Retrofit retrofit;

    public ServiceFactory(Converter.Factory converterFactory) throws IOException {
        retrofit = new Retrofit.Builder().baseUrl("").addConverterFactory(converterFactory).build();
    }

    public <T> T getService(final Class<T> service){
        return retrofit.create(service);
    }

}
