package com.coolweather.android.util;

import android.text.TextUtils;

import com.coolweather.android.db.City;
import com.coolweather.android.db.Country;
import com.coolweather.android.db.Province;
import com.coolweather.android.gson.Weather;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hjb on 2017/4/12.
 */

public class Utility {
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces = new JSONArray(response);
                for(int i=0;i<allProvinces.length();i++){
                    JSONObject provinceObject =allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCityResponse(String response,int provinced){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allCitys = new JSONArray(response);
                for(int i=0;i<allCitys.length();i++){
                    JSONObject CityObject =allCitys.getJSONObject(i);
                    City City = new City();
                    City.setCityName(CityObject.getString("name"));
                    City.setCityCdoe(CityObject.getInt("id"));
                    City.setProvinceId(provinced);
                    City.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCountryResponse(String response,int CityId){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allCountrys = new JSONArray(response);
                for(int i=0;i<allCountrys.length();i++){
                    JSONObject CountryObject =allCountrys.getJSONObject(i);
                    Country Country = new Country();
                    Country.setCountryName(CountryObject.getString("name"));
                    Country.setWeatherId(CountryObject.getString("weather_id"));
                    Country.setCityId(CityId);
                    Country.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static Weather handleWeatherResponse(String response){
        try{
            JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("HeWeather");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(weatherContent,Weather.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

}
