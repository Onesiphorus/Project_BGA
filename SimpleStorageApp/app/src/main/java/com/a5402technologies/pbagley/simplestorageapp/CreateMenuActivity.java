package com.a5402technologies.pbagley.simplestorageapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.a5402technologies.pbagley.simplestorageapp.Character.SaveStateCharacter;
import com.a5402technologies.pbagley.simplestorageapp.CharacterClass.CharacterClass;
import com.a5402technologies.pbagley.simplestorageapp.CharacterClass.SaveStateCharacterClass;

import java.util.List;

public class CreateMenuActivity extends AppCompatActivity{
    String msg = "Android : ";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_menu);
        Log.d(msg, "The onCreate() event");

        SaveStateCharacterClass saveStateCharacterClass = new SaveStateCharacterClass();

        saveStateCharacterClass = saveStateCharacterClass.loadData();

        final Button btn_new_class = findViewById(R.id.btn_new_class);
        btn_new_class.setOnClickListener((View v) -> {
                Intent NewClassActivity = new Intent(v.getContext(), com.a5402technologies.pbagley.simplestorageapp.CharacterClass.NewClassActivity.class);
                startActivity(NewClassActivity);
        });

        LinearLayout buttonContainer = findViewById(R.id.buttonContainer);

        if(null != saveStateCharacterClass) {
            List<CharacterClass> classes = saveStateCharacterClass.getClasses();
            for(int i = 0; i < classes.size(); i++) {
                Button btn = new Button(this);
                btn.setText(classes.get(i).getClassName());

                buttonContainer.addView(btn);
            }
        }

    }
}
