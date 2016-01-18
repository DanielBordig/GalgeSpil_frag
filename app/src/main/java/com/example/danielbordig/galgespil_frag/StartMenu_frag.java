package com.example.danielbordig.galgespil_frag;

import android.app.Fragment;
import android.os.Bundle;
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
public class StartMenu_frag extends Fragment implements View.OnClickListener {

    TextView headerMenu, secondHeader;
    Button startSpilBut, indstillingerBut, hjælpBut;

    public StartMenu_frag() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.start_menu, container, false);

        headerMenu = (TextView) root.findViewById(R.id.headerMenu);
        secondHeader = (TextView) root.findViewById(R.id.secondHeader);
        startSpilBut = (Button) root.findViewById(R.id.startSpilBut);
        indstillingerBut = (Button) root.findViewById(R.id.indstillingerBut);
        hjælpBut = (Button) root.findViewById(R.id.hjælpBut);

        startSpilBut.setOnClickListener(this);
        indstillingerBut.setOnClickListener(this);
        hjælpBut.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View v) {
        if(v==startSpilBut) getFragmentManager().beginTransaction().replace(R.id.fragment_main, new Main_keyboard_frag()).addToBackStack("backToMenu").commit();
        if(v==indstillingerBut) Toast.makeText(getActivity(), "virker ikke endnu", Toast.LENGTH_SHORT).show();
        if(v==hjælpBut) Toast.makeText(getActivity(),"ingen hjælp endnu", Toast.LENGTH_SHORT).show();
    }
}
