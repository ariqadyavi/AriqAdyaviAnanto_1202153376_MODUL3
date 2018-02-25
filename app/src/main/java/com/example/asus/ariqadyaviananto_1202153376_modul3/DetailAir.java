package com.example.asus.ariqadyaviananto_1202153376_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class DetailAir extends AppCompatActivity {

    private Button plus, minus; //deklarasi button plus dan minus
    private ImageView progress, gambar; //deklarasi imageview progress dan gambar
    private TextView judul, Detail, Stats; //deklarasi textview judul dan detail dan stats
    private int level =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailair);

        plus = findViewById(R.id.plus); //pemanggilan button plus
        minus = findViewById(R.id.minus); //pemanggilan button minus
        progress = findViewById(R.id.isiBatre); // pemanggilan imageview isibatre

        judul = findViewById(R.id.lblJudul); //pemanggilan textview lbljudul
        Detail = findViewById(R.id.lblDetail); //pemanggilan textview lbldetail
        gambar = findViewById(R.id.gambar); //pemanggilan imageview gambar
        Stats = findViewById(R.id.Status); //pemanggilan textview status

        Intent in = getIntent();
        String title=in.getStringExtra("etitle");
        String description=in.getStringExtra("edesc");
        if(description.length()<1){description="Hayolo\n";}
        int imgRes = in.getIntExtra("eimg",0);

        setTitle(title);
        judul.setText(title);
        Detail.setText(description);
        gambar.setImageResource(imgRes);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambahIsi();
            }
        }); //onclick untuk menambah level

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kurangIsi();
            }
        });//onclick untuk mengurangi level
    }


    public void tambahIsi(){ //penambahan level
        status();
        if(level==6){
            Toast.makeText(this,"Air Penuh",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(++level);
    }

    public void kurangIsi(){ //pengurangan level
        status();
        if(level==0){Toast.makeText(this,"Air Kosong",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(--level);
    }

    public void status(){
        Stats.setText(""+level+"L");
    }
}

