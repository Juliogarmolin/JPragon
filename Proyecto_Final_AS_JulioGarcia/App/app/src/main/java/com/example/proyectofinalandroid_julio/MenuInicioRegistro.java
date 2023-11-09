package com.example.proyectofinalandroid_julio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuInicioRegistro extends AppCompatActivity {
Button iniciar, regitro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicio_registro);

        iniciar = (Button)findViewById(R.id.btnInicioSesion);
        regitro = (Button)findViewById(R.id.btnRegistro);

    }

    public void NavegarMenuInicioSesion(View view){
        Intent siguiente = new Intent(this,MenuIniciarSesion.class);
        startActivity(siguiente);
    }

    public void NavegarMenuRegistro(View view){
        Intent siguiente = new Intent(this,MenuRegistro.class);
        startActivity(siguiente);
    }
}