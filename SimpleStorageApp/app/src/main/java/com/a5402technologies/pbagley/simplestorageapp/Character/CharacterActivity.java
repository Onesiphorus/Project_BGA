package com.a5402technologies.pbagley.simplestorageapp.Character;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.a5402technologies.pbagley.simplestorageapp.CharacterClass.CharacterClass;
import com.a5402technologies.pbagley.simplestorageapp.Gear.Activities.GearActivity;
import com.a5402technologies.pbagley.simplestorageapp.Gear.Models.Clothing;
import com.a5402technologies.pbagley.simplestorageapp.R;

public class CharacterActivity extends AppCompatActivity {
    String msg = "Android : ";

    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_view);
        Log.d(msg, "The onCreate() event");

        final CharacterClass characterClass = (CharacterClass) getIntent().getSerializableExtra("serialize_data");
        final Character character = new Character("Test", characterClass);
        ((TextView)findViewById(R.id.tv_name)).setText(character.getCharacterName());
        ((TextView)findViewById(R.id.tv_class)).setText(character.getCharacterClass().getClassName());
        Integer initiativeBase = character.getInitiative();
        Integer initiativeModifiers = 0;
        if(character.getClothing() != null) {
            for (Clothing clothing : character.getClothing())
                initiativeModifiers += clothing.getEquipped() ? clothing.getInitiativeBonus() : 0;
        }
        Integer initiativeFinal = initiativeBase + initiativeModifiers;
        ((TextView)findViewById(R.id.tv_init)).setText(initiativeFinal.toString());

        ((TextView)findViewById(R.id.tv_max_grit)).setText(character.getMaxGrit().toString());
        ((TextView)findViewById(R.id.tv_agility)).setText(character.getAgility().toString());
        ((TextView)findViewById(R.id.tv_cunning)).setText(character.getCunning().toString());
        ((TextView)findViewById(R.id.tv_spirit)).setText(character.getSpirit().toString());
        ((TextView)findViewById(R.id.tv_strength)).setText(character.getStrength().toString());
        ((TextView)findViewById(R.id.tv_lore)).setText(character.getLore().toString());
        ((TextView)findViewById(R.id.tv_luck)).setText(character.getLuck().toString());
        ((TextView)findViewById(R.id.tv_health)).setText(character.getHealth().toString());
        ((TextView)findViewById(R.id.tv_defense)).setText(character.getDefense().toString());
        ((TextView)findViewById(R.id.tv_armor)).setText(character.getArmor().toString());
        ((TextView)findViewById(R.id.tv_sanity)).setText(character.getSanity().toString());
        ((TextView)findViewById(R.id.tv_willpower)).setText(character.getWillpower().toString());
        ((TextView)findViewById(R.id.tv_sparmor)).setText(character.getSpiritArmor().toString());
        ((TextView)findViewById(R.id.tv_ranged)).setText(character.getCharacterClass().getRangedToHit().toString());
        ((TextView)findViewById(R.id.tv_melee)).setText(character.getCharacterClass().getMeleeToHit().toString());
        ((TextView)findViewById(R.id.tv_combat)).setText(character.getCombat().toString());

        final Button btn_equip = findViewById(R.id.btn_equip);
        btn_equip.setOnClickListener((View v) -> {
                Intent GearActivity = new Intent(v.getContext(), GearActivity.class);
                GearActivity.putExtra("serialize_data", character);
                startActivity(GearActivity);
        });

        final Button btn_weapons = findViewById(R.id.btn_weapons);
        btn_weapons.setOnClickListener((View v) -> {
                Intent GearActivity = new Intent(v.getContext(), GearActivity.class);
                GearActivity.putExtra("serialize_data", character);
                startActivity(GearActivity);
        });

        final Button btn_items = findViewById(R.id.btn_items);
        btn_items.setOnClickListener((View v) -> {
                Intent GearActivity = new Intent(v.getContext(), GearActivity.class);
                startActivity(GearActivity);
        });

        final Button btn_side_bag = findViewById(R.id.btn_sidebag);
        btn_side_bag.setOnClickListener((View v) -> {
                Intent GearActivity = new Intent(v.getContext(), GearActivity.class);
                startActivity(GearActivity);
        });

        final Button btn_effects = findViewById(R.id.btn_effects);
        btn_effects.setOnClickListener((View v) -> {
                Intent GearActivity = new Intent(v.getContext(), GearActivity.class);
                startActivity(GearActivity);
        });

        final Button btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener((View v) -> {
                Intent GearActivity = new Intent(v.getContext(), GearActivity.class);
                startActivity(GearActivity);
        });
    }
}
