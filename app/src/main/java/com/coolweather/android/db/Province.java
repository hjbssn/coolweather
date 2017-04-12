package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hjb on 2017/4/12.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName  = provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProbinceCode(int probinceCode){
        this.provinceCode = probinceCode;
    }
}
