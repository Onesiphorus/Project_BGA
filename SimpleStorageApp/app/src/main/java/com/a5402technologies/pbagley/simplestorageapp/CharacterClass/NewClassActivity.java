package com.a5402technologies.pbagley.simplestorageapp.CharacterClass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.a5402technologies.pbagley.simplestorageapp.R;

public class NewClassActivity extends AppCompatActivity {
    String msg = "Android : ";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_class);
        Log.d(msg, "The onCreate() event");

        final Button btn_done = findViewById(R.id.btn_done);
        btn_done.setOnClickListener((View v) -> {
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
                SaveStateCharacterClass.ccs.add(characterClass);
                SaveStateCharacterClass.saveData(SaveStateCharacterClass.getInstance());
                SaveStateCharacterClass save = SaveStateCharacterClass.loadData();
                Intent CharacterActivity = new Intent(v.getContext(), com.a5402technologies.pbagley.simplestorageapp.Character.CharacterActivity.class);
                CharacterActivity.putExtra("serialize_data", characterClass);
                startActivity(CharacterActivity);
        });
    }


}
