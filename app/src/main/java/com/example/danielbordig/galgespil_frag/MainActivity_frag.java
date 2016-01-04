package com.example.danielbordig.galgespil_frag;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity_frag extends FragmentActivity {

    public static Galgelogik galgeMainAct;
    public static boolean gotNewWords = false;
    Fragment mainFragment = new Main_frag();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (galgeMainAct == null) galgeMainAct = new Galgelogik();

        getFragmentManager().beginTransaction().add(R.id.fragment_main, mainFragment).commit();
    }

}
