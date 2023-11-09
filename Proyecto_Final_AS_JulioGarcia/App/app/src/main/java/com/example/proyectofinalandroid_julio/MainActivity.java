package com.example.proyectofinalandroid_julio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton btnIniciarLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciarLogo= (ImageButton)findViewById(R.id.btnIniciarLogo);
    }

    public void NavegarMenuInicioRegistro(View view){
        Intent siguiente = new Intent(this,MenuInicioRegistro.class);
        startActivity(siguiente);
    }

}