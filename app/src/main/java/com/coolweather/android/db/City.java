package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hjb on 2017/4/12.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCdoe;
    private int provinceId;

    public int getId(){
        return id;
    }
    public String getCityName(){
        return cityName;
    }
    public int getCityCdoe(){
        return cityCdoe;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public  void setId(int id){
        this.id=id;
    }
    public void setCityName(String cityName){
        this.cityName= cityName;
    }
    public void setCityCdoe(int cityCdoe){
        this.cityCdoe = cityCdoe;
    }
    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }

}
