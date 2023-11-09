package com.example.proyectofinalandroid_julio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MenuApps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_apps);
    }

    public void btnQR(View view) {
        Intent siguiente = new Intent(this, QRApp.class);
        startActivity(siguiente);
    }

    public void btnMusica(View view) {
        Intent siguiente = new Intent(this, MusicaApp.class);
        startActivity(siguiente);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item1) {
            Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
            Intent perfil = new Intent(this, Perfil.class);
            startActivity(perfil);
        }
        return super.onOptionsItemSelected(item);
    }
}