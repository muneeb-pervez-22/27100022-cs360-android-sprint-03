package com.example.listycitylab3;
import java.io.Serializable;

public class City implements Comparable<City>, Serializable {
    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCity(){
        return this.city;
    }

    String getProvince(){
        return this.province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCity());
    }
}