package com.possederhana.dapur.helper;

public class UrlApi {
    // Default Android Emulator Studio IP
    // public static final String BASE_URL_API = "http://10.0.2.2/app-rumahsakit/";

//    public static final String BASE_URL_API = "http://103.56.148.49/";
    public static final String BASE_URL_API = "http://192,169.1.5/";

    public static BaseApiService getAPIService() {
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}