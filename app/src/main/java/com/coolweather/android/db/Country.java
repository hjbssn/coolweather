package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hjb on 2017/4/12.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public int getId(){
        return id;
    }
    public String getCountryName(){
        return countryName;
    }
    public String getWeatherId(){
        return weatherId;
    }

    public int getCityId(){
        return cityId;
    }
    public  void setId(int id){
        this.id=id;
    }
    public void setCountryName(String countryName){
        this.countryName = countryName;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }
}
