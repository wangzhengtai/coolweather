package com.example.coolweather.gson;

/**
 * Created by 秋殇 on 2017/9/20.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
