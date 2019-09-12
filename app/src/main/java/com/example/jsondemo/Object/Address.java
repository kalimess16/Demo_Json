package com.example.jsondemo.Object;

public class Address {
    private String mStreet,mCity;

    public Address() {

    }

    public Address(String street, String city) {
        mStreet = street;
        mCity = city;
    }

    public String getStreet() {
        return mStreet;
    }

    public void setStreet(String street) {
        mStreet = street;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    @Override
    public String toString() {
        return "Address{" + "mStreet='" + mStreet + '\'' + ", mCity='" + mCity + '\'' + '}';
    }
}
