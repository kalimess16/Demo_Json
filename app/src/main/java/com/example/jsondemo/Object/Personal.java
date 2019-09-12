package com.example.jsondemo.Object;

import java.util.Arrays;

public class Personal {
    private int[] mId;
    private String[] mName;
    private int[] mAge;
    private String mGender;
    private Address mAddress;

    public Personal() {
    }

    public Personal(int[] id, String[] name, int[] age, String gender, Address address) {
        mId = id;
        mName = name;
        mAge = age;
        mGender = gender;
        mAddress = address;
    }

    @Override
    public String toString() {
        return "Personal{"
                + "mId="
                + Arrays.toString(mId)
                + ", mName="
                + Arrays.toString(mName)
                + ", mAge="
                + Arrays.toString(mAge)
                + ", mGender='"
                + mGender
                + '\''
                + ", mAddress="
                + mAddress
                + '}';
    }

    public int[] getId() {
        return mId;
    }

    public void setId(int[] id) {
        mId = id;
    }

    public String[] getName() {
        return mName;
    }

    public void setName(String[] name) {
        mName = name;
    }

    public int[] getAge() {
        return mAge;
    }

    public void setAge(int[] age) {
        mAge = age;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public Address getAddress() {
        return mAddress;
    }

    public void setAddress(Address address) {
        mAddress = address;
    }
}
