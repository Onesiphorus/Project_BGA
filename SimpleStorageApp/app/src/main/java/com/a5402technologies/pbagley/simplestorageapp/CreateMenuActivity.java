package com.a5402technologies.pbagley.simplestorageapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class CreateMenuActivity extends AppCompatActivity{
    String msg = "Android : ";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_menu);
        Log.d(msg, "The onCreate() event");

        final Button btn_new_class = findViewById(R.id.btn_new_class);
        btn_new_class.setOnClickListener((View v) -> {
                Intent NewClassActivity = new Intent(v.getContext(), com.a5402technologies.pbagley.simplestorageapp.CharacterClass.NewClassActivity.class);
                startActivity(NewClassActivity);
        });
    }
}
