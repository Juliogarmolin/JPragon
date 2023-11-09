package com.example.proyectofinalandroid_julio;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.AuthFailureError;
import com.android.volley.toolbox.Volley;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class MenuRegistro extends AppCompatActivity {

    EditText usuario;
    EditText contrasena;
    Button registrar;
    RequestQueue requestQueue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_registro);

        registrar = (Button)findViewById(R.id.btnRegistro2);
        usuario = (EditText)findViewById(R.id.edtUsuario);
        contrasena = (EditText)findViewById(R.id.edtContra);

    }

    public void registrarUser(View view){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://julio.jantoniosr.com/jpragon/guardar.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "IT HAS BEEN SUCCESSFULLY REGISTERED", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_SHORT).show();
            }
        }){
            @Nullable
            @Override
            protected Map<String, String>getParams()throws AuthFailureError{
                Map<String,String>parametros = new HashMap<String, String>();
                //ESTAS SON LAS $VARIABLES DEL MICROSERVICIO EN PHP
                parametros.put("usuario", usuario.getText().toString());
                parametros.put("contrasena",contrasena.getText().toString());

                return parametros;
            }
        };

            boolean retorno = true;

            String c1 = usuario.getText().toString();
            String c2 = contrasena.getText().toString();
            if(c1.isEmpty()){
                usuario.setError("Can't be empty");
                retorno=false;
            }
            if(c2.isEmpty()){
                contrasena.setError("Can't be empty");
                retorno = false;
            }

            if(retorno == true){
                requestQueue = Volley.newRequestQueue(this);
                requestQueue.add(stringRequest);

                Intent registrar = new Intent(this,MenuIniciarSesion.class);
                startActivity(registrar);
            }else if(retorno==false){
                Toast.makeText(this, "Can't be empty", Toast.LENGTH_SHORT).show();
            }
    }

    public void Volver(View view){
        Intent volver = new Intent(this,MenuInicioRegistro.class);
        startActivity(volver);
    }
}