package com.a5402technologies.pbagley.simplestorageapp.Gear.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.a5402technologies.pbagley.simplestorageapp.Character.Character;
import com.a5402technologies.pbagley.simplestorageapp.R;

public class GearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gear);

        final Character character = (Character) getIntent().getSerializableExtra("serialize_data");

        final Button btn_done = findViewById(R.id.btn_new_gear);
        btn_done.setOnClickListener((View v) -> {

        });




    }
}
