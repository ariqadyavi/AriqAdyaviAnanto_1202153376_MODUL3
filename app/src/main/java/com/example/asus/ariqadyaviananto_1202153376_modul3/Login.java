package com.example.asus.ariqadyaviananto_1202153376_modul3;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {

    private EditText name; //deklarasi edittext name
    private EditText password; //deklarasi edittext password
    private Button login; //delklarasi button login


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        name = (EditText) findViewById(R.id.name); //pemanggilan edittext name
        password = (EditText) findViewById(R.id.password); //pemanggilan edittext password
        login = (Button) findViewById(R.id.login); //pemanggilan button login
    }


    public void Login(View view) {
        String username = String.valueOf(name.getText()); //pemanggilan isi dari edittext name
        String pass = String.valueOf(password.getText()); //pemanggilan isi dari edittext password

        if(username.equals("EAD") && pass.equals("MOBILE")){ //jika isi username sama dengan EAD dan pass sama dengan MOBILE
            Toast.makeText(this, "Login Succed", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Login.this, MainActivity.class)); //akan menuju ke class main activity
            finish();
        }else{
            Toast.makeText(this, "Wrong Password", Toast.LENGTH_SHORT).show();
        }
    }
}
