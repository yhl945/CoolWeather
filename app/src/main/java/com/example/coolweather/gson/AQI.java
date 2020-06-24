package com.example.coolweather.gson;
/*
* aqi 和pm25
* */
public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
