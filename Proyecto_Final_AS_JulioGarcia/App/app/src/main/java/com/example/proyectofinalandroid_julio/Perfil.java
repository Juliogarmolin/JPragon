package com.example.proyectofinalandroid_julio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }
    public void Volver2(View view){
        Intent volver2 = new Intent(this,MenuInicioRegistro.class);
        startActivity(volver2);
    }

    public void VolverMenu(View view){
        Intent volver = new Intent(this,MenuApps.class);
        startActivity(volver);

    }
}