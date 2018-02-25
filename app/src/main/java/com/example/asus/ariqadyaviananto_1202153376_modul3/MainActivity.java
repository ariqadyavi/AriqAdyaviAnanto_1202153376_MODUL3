package com.example.asus.ariqadyaviananto_1202153376_modul3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView; //deklarasi recylerview
    private Adapter mAdapter; //deklarasi adapter

    public static ArrayList<Item> DATA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DATA = isi(); //data untuk dimasukan ke arraylist
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList);
        mAdapter = new Adapter(DATA);
        recyclerView.setAdapter(mAdapter);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }

    public ArrayList<Item> isi(){ //data arraylist
        ArrayList<Item> data = new ArrayList<>();
        data.add(new Item("Aqua","Ini adalah AMDK merk AQUA","Aqua Aqua Aqua Aqua Aqua Aqua Aqua Aqua Aqua Aqua Aqua Aqua",R.drawable.aqua));
        data.add(new Item("Amidis","Ini adalah AMDK merk AMIDIS","Amidis Amidis Amidis Amidis Amidis Amidis Amidis Amidis",R.drawable.amidis));
        data.add(new Item("Cleo","Ini adalah AMDK merk CLEO","Cleo Cleo Cleo Cleo Cleo Cleo Cleo Cleo Cleo Cleo Cleo Cleo ",R.drawable.cleo));
        data.add(new Item("Club","Ini adalah AMDK merk CLUB","Anti Social Social Club",R.drawable.club));
        data.add(new Item("Equil","Ini adalah AMDK merk EQUIL","Equil Equil Equil Equil Equil Equil Equil Equil Equil ",R.drawable.equil));
        data.add(new Item("Evian","Ini adalah AMDK merk EVIAN","I drinkin evian when i wake up",R.drawable.evian));
        data.add(new Item("Le Minerale","Ini adalah AMDK merk LE MINERALE","Ada manis-masnisnya gicuuw",R.drawable.leminerale));
        data.add(new Item("Nestle","Ini adalah AMDK merk NESTLE","Nestle Nestle Nestle Nestle Nestle Nestle Nestle ",R.drawable.nestle));
        data.add(new Item("Pristine","Ini adalah AMDK merk PRISTINE","Pristine Pristine Pristine Pristine Pristine Pristine ",R.drawable.pristine));
        data.add(new Item("Vit","Ini adalah AMDK merk VIT","vit vit vit vit vit vit vit vit vit vit vit vit ",R.drawable.vit));
        return data;
    }
}