package com.example.searchlol.utils;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NetworkUtils {
    private static final OkHttpClient mHTTPClient = new OkHttpClient();

    public static String doHttpGet(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();
        Response response = mHTTPClient.newCall(request).execute();
        try {
            return response.body().string();
        } finally {
            response.close();
        }
    }
}
