package com.example.danielbordig.galgespil_frag;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AllWords_frag extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_words);

        ArrayList<String> words = MainActivity_frag.galgeMainAct.getMuligeOrd();

        ListView lv = new ListView(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, words);
        lv.setAdapter(adapter);
        setContentView(lv);
    }
}
