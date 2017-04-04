package com.example.navendu.retrofit.model;

/**
 * Created by navendu on 09-02-2017.
 */
public class student {
    private String ticker;
    private float open;
    private float close;
    private int volume;
    public student(String name,float address,float mobile,int volume)
    {
        this.ticker=name;
        this.open=address;
        this.close=mobile;
        this.volume=volume;
    }

    public String getTicker() {
        return ticker;
    }

    public float getOpen() {
        return open;
    }

    public float getClose() {
        return close;
    }

    public int getVolume() {
        return volume;
    }
}
