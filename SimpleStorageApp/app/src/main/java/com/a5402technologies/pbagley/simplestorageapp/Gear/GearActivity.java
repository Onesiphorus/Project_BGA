package com.a5402technologies.pbagley.simplestorageapp.Gear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.a5402technologies.pbagley.simplestorageapp.Character.Character;
import com.a5402technologies.pbagley.simplestorageapp.R;

public class GearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gear);

        final Character character = (Character) getIntent().getSerializableExtra("serialize_data");


    }
}
