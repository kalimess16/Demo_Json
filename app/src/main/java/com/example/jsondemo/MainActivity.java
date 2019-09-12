package com.example.jsondemo;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.jsondemo.Object.Personal;
import java.io.IOException;
import org.json.JSONException;

public class MainActivity extends AppCompatActivity {
    private TextView mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = findViewById(R.id.text_example);
    }

    public void onClick(View view) throws IOException, JSONException {
        Personal personal = ReadJSON.readOnlyPersonal(this);
        mEditText.setText(personal.toString());
    }
}
