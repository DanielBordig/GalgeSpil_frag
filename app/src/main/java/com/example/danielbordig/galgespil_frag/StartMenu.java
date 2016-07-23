package com.example.danielbordig.galgespil_frag;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Daniel Bordig on 18-01-2016.
 */
public class StartMenu extends FragmentActivity implements View.OnClickListener {

    TextView headerMenu, secondHeader;
    Button startSpilBut, indstillingerBut, hjælpBut;
    public static Galgelogik galge;

    public StartMenu() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_menu);

        galge = new Galgelogik();
        galge.originaleOrd();

        headerMenu = (TextView) findViewById(R.id.headerMenu);
        secondHeader = (TextView) findViewById(R.id.secondHeader);
        startSpilBut = (Button) findViewById(R.id.startSpilBut);
        indstillingerBut = (Button) findViewById(R.id.indstillingerBut);
        hjælpBut = (Button) findViewById(R.id.hjælpBut);

        startSpilBut.setOnClickListener(this);
        indstillingerBut.setOnClickListener(this);
        hjælpBut.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==startSpilBut) startActivity(new Intent(getApplicationContext(), MainActivity.class));
        if(v==indstillingerBut) startActivity((new Intent(getApplicationContext(), Options.class)));
        if(v==hjælpBut) Toast.makeText(this,"ingen hjælp endnu", Toast.LENGTH_SHORT).show();
    }
}
