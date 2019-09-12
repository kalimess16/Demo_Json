package com.example.jsondemo;

import android.content.Context;
import com.example.jsondemo.Object.Address;
import com.example.jsondemo.Object.Personal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ReadJSON {
    static Personal readOnlyPersonal(Context context) throws IOException, JSONException {

        // đọc nôi dung từ file information.json

        String mJsonText = readText(context);

        // dối tượng gốc mô tả trong information.json
        JSONObject jsonObject = new JSONObject(mJsonText);

        // gán giái trị trong Json vào các tham số.
/*
        int mID = jsonObject.getInt("ID");
        String nName = jsonObject.getString("Name");
        int mAge = jsonObject.getInt("Age");*/

        JSONArray jsonArrayID = jsonObject.getJSONArray("ID");
        int[] mID = new int[jsonArrayID.length()];
        for (int i=0;i<jsonArrayID.length();i++){
            mID[i] = jsonArrayID.getInt(i);
        }

        JSONArray jsonArrayName = jsonObject.getJSONArray("Name");
        String[] mName = new String[jsonArrayName.length()];
        for (int i=0;i<jsonArrayName.length();i++){
            mName[i] = jsonArrayName.getString(i);
        }

        JSONArray jsonArrayAge = jsonObject.getJSONArray("Age");
        int[] mAge = new int[jsonArrayAge.length()];
        for (int i=0;i<jsonArrayAge.length();i++){
            mAge[i] = jsonArrayAge.getInt(i);
        }

        JSONObject jsonObjectAddress = jsonObject.getJSONObject("Address");
        String mStreet = jsonObjectAddress.getString("Street");
        String mCity = jsonObjectAddress.getString("City");
        String mGender = jsonObject.getString("Gender");

        // dua data tu JSON vao Object
        Address address = new Address(mStreet, mCity);

        Personal personal = new Personal();
        personal.setId(mID);
        personal.setName(mName);
        personal.setGender(mGender);
        personal.setAge(mAge);
        personal.setAddress(address);

        return personal;
    }

    // đọc là lấy thông tin từ file Json và bỏ vào String Buffer.
    private static String readText(Context context) throws IOException {
        InputStream inputStream = context.getResources().openRawResource(R.raw.information);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder stringBuffer = new StringBuilder();
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            stringBuffer.append(s);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }
}
