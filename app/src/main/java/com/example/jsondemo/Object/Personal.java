package com.example.jsondemo.Object;

public class Personal {
    private String mName;
    private int mAge;
    private String mGender,mAddress;

    public Personal(String name, int age, String gender, String address) {
        mName = name;
        mAge = age;
        mGender = gender;
        mAddress = address;
    }

    public Personal() {
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    @Override
    public String toString() {
        return "Personal{"
                + "mName='"
                + mName
                + '\''
                + ", mAge="
                + mAge
                + ", mGender='"
                + mGender
                + '\''
                + ", mAddress='"
                + mAddress
                + '\''
                + '}';
    }
}
