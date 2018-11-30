package com.example.itsukiichiyuu.syteme_solaire;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView MaListe ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaListe = (ListView) findViewById(R.id.liste);
        Resources res = getResources();
        String[] MesValeurs = res.getStringArray(R.array.planetes);

        final ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,MesValeurs);
        MaListe.setAdapter(adapter);
    }

}
