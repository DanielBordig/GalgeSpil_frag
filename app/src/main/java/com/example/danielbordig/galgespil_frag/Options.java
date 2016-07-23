package com.example.danielbordig.galgespil_frag;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.CheckBox;

public class Options extends FragmentActivity implements View.OnClickListener{

    CheckBox checkBoxOriginal, checkBoxPokemon, checkBoxLayoutWrite, checkBoxLayoutKeyboard;
    static boolean booleanOriginal = true, booleanPokemon, booleanLayoutWrite, booleanLayoutKeyboard = true;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indstillinger_layout);

        checkBoxOriginal = (CheckBox) findViewById(R.id.checkBoxOriginal);
        checkBoxPokemon = (CheckBox) findViewById(R.id.checkBoxPokemon);
        checkBoxLayoutWrite = (CheckBox) findViewById(R.id.checkBoxLayoutWrite);
        checkBoxLayoutKeyboard = (CheckBox) findViewById(R.id.checkBoxLayoutKeyboard);

        if(booleanOriginal) checkBoxOriginal.setChecked(true);
        if(booleanPokemon) checkBoxPokemon.setChecked(true);
        if(booleanLayoutWrite) checkBoxLayoutWrite.setChecked(true);
        if(booleanLayoutKeyboard) checkBoxLayoutKeyboard.setChecked(true);

        checkBoxOriginal.setOnClickListener(this);
        checkBoxPokemon.setOnClickListener(this);
        checkBoxLayoutWrite.setOnClickListener(this);
        checkBoxLayoutKeyboard.setOnClickListener(this);
    }

    @Override
    public void onResume(){
        super.onResume();
        if(checkBoxOriginal.isChecked()) checkBoxOriginal.setClickable(false);
        if(checkBoxPokemon.isChecked()) checkBoxPokemon.setClickable(false);
        if(checkBoxLayoutWrite.isChecked()) checkBoxLayoutWrite.setClickable(false);
        if(checkBoxLayoutKeyboard.isChecked()) checkBoxLayoutKeyboard.setClickable(false);
    }


    @Override
    public void onClick(View v) {
        if(v==checkBoxOriginal){
            checkBoxPokemon.setChecked(false);
            checkBoxOriginal.setClickable(false);
            checkBoxPokemon.setClickable(true);
            StartMenu.galge.originaleOrd();
        }
        if(v==checkBoxPokemon){
            checkBoxOriginal.setChecked(false);
            checkBoxPokemon.setClickable(false);
            checkBoxOriginal.setClickable(true);
            StartMenu.galge.pokemonList();
        }
        if(v==checkBoxLayoutWrite) {
            checkBoxLayoutKeyboard.setChecked(false);
            checkBoxLayoutWrite.setClickable(false);
            checkBoxLayoutKeyboard.setClickable(true);
        }
        if(v==checkBoxLayoutKeyboard){
            checkBoxLayoutWrite.setChecked(false);
            checkBoxLayoutKeyboard.setClickable(false);
            checkBoxLayoutWrite.setClickable(true);
        }
    }
}
