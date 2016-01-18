package com.example.danielbordig.galgespil_frag;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

    public static Galgelogik galgeMainAct;
    public static boolean gotNewWords = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (galgeMainAct == null) galgeMainAct = new Galgelogik();

        getFragmentManager().beginTransaction().add(R.id.fragment_main, new StartMenu_frag()).commit();
    }

    @Override
    public void onBackPressed(){
        if(getFragmentManager().getBackStackEntryCount() == 0) super.onBackPressed();
        else getFragmentManager().popBackStack();
    }

}
