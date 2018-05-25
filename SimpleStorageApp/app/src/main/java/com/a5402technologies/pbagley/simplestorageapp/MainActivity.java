package com.a5402technologies.pbagley.simplestorageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String msg = "Android : ";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event");

        final Button btn_create = findViewById(R.id.btn_create);
        btn_create.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.create_menu);
            }
        });

        final Button btn_new_class = findViewById(R.id.btn_new_class);
        btn_new_class.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.new_class);
            }
        });

        final Button btn_done = findViewById(R.id.btn_done);
        btn_done.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharacterClass characterClass = new CharacterClass(
                        ((EditText)findViewById(R.id.et_class_name)).getText().toString(),
                        Integer.parseInt(((EditText)findViewById(R.id.et_agility)).getText().toString()),
                        Integer.parseInt(((EditText)findViewById(R.id.et_cunning)).getText().toString()),
                        Integer.parseInt(((EditText)findViewById(R.id.et_spirit)).getText().toString()),
                        Integer.parseInt(((EditText)findViewById(R.id.et_strength)).getText().toString()),
                        Integer.parseInt(((EditText)findViewById(R.id.et_lore)).getText().toString()),
                        Integer.parseInt(((EditText)findViewById(R.id.et_luck)).getText().toString()),
                        Integer.parseInt(((EditText)findViewById(R.id.et_health)).getText().toString()),
                        Integer.parseInt(((EditText)findViewById(R.id.et_defense)).getText().toString()),
                        Integer.parseInt(((EditText)findViewById(R.id.et_sanity)).getText().toString()),
                        Integer.parseInt(((EditText)findViewById(R.id.et_willpower)).getText().toString()),
                        Integer.parseInt(((EditText)findViewById(R.id.et_ranged)).getText().toString()),
                        Integer.parseInt(((EditText)findViewById(R.id.et_melee)).getText().toString()),
                        Integer.parseInt(((EditText)findViewById(R.id.et_combat)).getText().toString()),
                        Integer.parseInt(((EditText)findViewById(R.id.et_init)).getText().toString()),
                        Integer.parseInt(((EditText)findViewById(R.id.et_max_grit)).getText().toString()));
                SaveState.ccs.add(characterClass);
                SaveState.saveData(SaveState.getInstance());
                SaveState save = SaveState.loadData();
                setContentView(R.layout.character_view);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }

}

