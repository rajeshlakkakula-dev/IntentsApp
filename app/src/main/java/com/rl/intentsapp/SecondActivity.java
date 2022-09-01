package com.rl.intentsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle  extras= getIntent().getExtras();

        String value= extras.getString("value1");
        Toast.makeText(this, "First Activity "+value, Toast.LENGTH_LONG).show();

    }
}