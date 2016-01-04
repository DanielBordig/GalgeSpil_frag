package com.example.danielbordig.galgespil_frag;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GameEnd_frag extends Fragment implements View.OnClickListener {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    TextView endMessage;
    ImageView endImage;
    Button newWords, newGame, restartWords;
    private ArrayList<String> ordFraDr = new ArrayList<String>();


    public GameEnd_frag() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_game_end_frag, container, false);

        endMessage = (TextView) root.findViewById(R.id.endMessage);
        endImage = (ImageView) root.findViewById(R.id.imageView2);
        restartWords = (Button) root.findViewById(R.id.restartWords);
        newWords = (Button) root.findViewById(R.id.newWords);
        newGame = (Button) root.findViewById(R.id.newGame);

        restartWords.setOnClickListener(this);
        newWords.setOnClickListener(this);
        newGame.setOnClickListener(this);

        if (Main_frag.galgeMain.erSpilletTabt()) {
            endMessage.setText("Du har tabt. Det rigtige ord var " + Main_frag.galgeMain.getOrdet());
            endImage.setImageResource(R.mipmap.dead);
        }
        if (Main_frag.galgeMain.erSpilletVundet()){
            endMessage.setText("Du har vundet");
            endImage.setImageResource(R.mipmap.thumb_up);
        }

        return root;
    }

    @Override
    public void onClick(View v) {
        if(v==restartWords) MainActivity_frag.gotNewWords = false;
        if(v==newWords){
            new AsyncTask(){
                @Override
                protected Object doInBackground(Object... arg0) {
                    try {
                        MainActivity_frag.galgeMainAct.hentOrdFraDr();
                        return "Ordene blev korrekt hentet fra DR's server";
                    } catch (Exception e) {
                        e.printStackTrace();
                        return "Ordene blev ikke hentet korrekt: "+e;
                    }
                }
                @Override
                protected void onPostExecute(Object resultat) {
                    endMessage.setText("resultat: \n" + resultat);
                    ordFraDr.add(resultat.toString());
                }
            }.execute();
        }
        if(v==newGame) {
            Fragment fragmentMain = new Main_frag();
            getFragmentManager().beginTransaction().replace(R.id.fragment_main, fragmentMain).commit();
        }
    }

}
