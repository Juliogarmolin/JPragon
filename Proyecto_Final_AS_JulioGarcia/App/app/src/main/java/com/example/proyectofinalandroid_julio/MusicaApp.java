package com.example.proyectofinalandroid_julio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MusicaApp extends AppCompatActivity {
ImageButton play_pause, btn_repetir;
MediaPlayer mp;
ImageView iv;
int repetir =2, posicion =0;
MediaPlayer vectormp[] = new MediaPlayer[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica_app);

        play_pause =(ImageButton)findViewById(R.id.btn_play);
        btn_repetir=(ImageButton)findViewById(R.id.btn_no_repetir);
        iv = (ImageView)findViewById(R.id.imageView10);

        vectormp[0] = MediaPlayer.create(this, R.raw.genius);
        vectormp[1] = MediaPlayer.create(this, R.raw.nohay2sin3);
        vectormp[2] = MediaPlayer.create(this, R.raw.paddlingout);
        vectormp[3] = MediaPlayer.create(this, R.raw.smile);
        vectormp[4] = MediaPlayer.create(this, R.raw.song2);
        vectormp[5] = MediaPlayer.create(this, R.raw.stereolove);
        vectormp[6] = MediaPlayer.create(this, R.raw.takeitoff);
        vectormp[7] = MediaPlayer.create(this, R.raw.walk);
    }

    public void  playPause(View view){
        if (vectormp[posicion].isPlaying()){
            vectormp[posicion].pause();
            play_pause.setBackgroundResource(R.drawable.reproducir);
            Toast.makeText(this, "Pausa", Toast.LENGTH_SHORT).show();
        }else{
            vectormp[posicion].start();
            play_pause.setBackgroundResource(R.drawable.pausa);
            Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show();
        }
    }

    public void stop(View view){
        if(vectormp[posicion] != null){
            vectormp[posicion].stop();

            vectormp[0] = MediaPlayer.create(this, R.raw.genius);
            vectormp[1] = MediaPlayer.create(this, R.raw.nohay2sin3);
            vectormp[2] = MediaPlayer.create(this, R.raw.paddlingout);
            vectormp[3] = MediaPlayer.create(this, R.raw.smile);
            vectormp[4] = MediaPlayer.create(this, R.raw.song2);
            vectormp[5] = MediaPlayer.create(this, R.raw.stereolove);
            vectormp[6] = MediaPlayer.create(this, R.raw.takeitoff);
            vectormp[7] = MediaPlayer.create(this, R.raw.walk);
            posicion = 0;
            play_pause.setBackgroundResource(R.drawable.reproducir);
            iv.setImageResource(R.drawable.cover);
            Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
        }
    }

    public void repetir(View view){
        if(repetir == 1){
            btn_repetir.setBackgroundResource(R.drawable.no_repetir);
            Toast.makeText(this, "No repetir", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(false);
            repetir = 2;
        } else {
            btn_repetir.setBackgroundResource(R.drawable.repetir);
            Toast.makeText(this, "Repetir", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(true);
            repetir = 1;
        }
    }

    public void Siguiente(View view){
        if(posicion < vectormp.length -1){
            if(vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                posicion++;
                vectormp[posicion].start();
                if(posicion == 0){
                    iv.setImageResource(R.drawable.genius);
                } else if(posicion == 1){
                    iv.setImageResource(R.drawable.nohay2sin3);
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.paddlingout);
                }else if(posicion == 3){
                    iv.setImageResource(R.drawable.smile);
                }else if(posicion == 4){
                    iv.setImageResource(R.drawable.song2);
                }else if(posicion == 5){
                    iv.setImageResource(R.drawable.stereolove);
                }else if(posicion == 6){
                    iv.setImageResource(R.drawable.takeitoff);
                }else if(posicion == 7){
                    iv.setImageResource(R.drawable.walk);
                }
            } else {
                posicion++;
                if(posicion == 0){
                    iv.setImageResource(R.drawable.genius);
                } else if(posicion == 1){
                    iv.setImageResource(R.drawable.nohay2sin3);
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.paddlingout);
                }else if(posicion == 3){
                    iv.setImageResource(R.drawable.smile);
                }else if(posicion == 4){
                    iv.setImageResource(R.drawable.song2);
                }else if(posicion == 5){
                    iv.setImageResource(R.drawable.stereolove);
                }else if(posicion == 6){
                    iv.setImageResource(R.drawable.takeitoff);
                }else if(posicion == 7){
                    iv.setImageResource(R.drawable.walk);
                }
            }
        } else {
            Toast.makeText(this, "No hay más canciones", Toast.LENGTH_SHORT).show();
        }
    }

    public void Anterior(View view){
        if(posicion >= 1){
            if(vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                vectormp[0] = MediaPlayer.create(this, R.raw.genius);
                vectormp[1] = MediaPlayer.create(this, R.raw.nohay2sin3);
                vectormp[2] = MediaPlayer.create(this, R.raw.paddlingout);
                vectormp[3] = MediaPlayer.create(this, R.raw.smile);
                vectormp[4] = MediaPlayer.create(this, R.raw.song2);
                vectormp[5] = MediaPlayer.create(this, R.raw.stereolove);
                vectormp[6] = MediaPlayer.create(this, R.raw.takeitoff);
                vectormp[7] = MediaPlayer.create(this, R.raw.walk);
                posicion--;

                if(posicion == 0){
                    iv.setImageResource(R.drawable.genius);
                } else if(posicion == 1){
                    iv.setImageResource(R.drawable.nohay2sin3);
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.paddlingout);
                }else if(posicion == 3){
                    iv.setImageResource(R.drawable.smile);
                }else if(posicion == 4){
                    iv.setImageResource(R.drawable.song2);
                }else if(posicion == 5){
                    iv.setImageResource(R.drawable.stereolove);
                }else if(posicion == 6){
                    iv.setImageResource(R.drawable.takeitoff);
                }else if(posicion == 7){
                    iv.setImageResource(R.drawable.walk);
                }
                vectormp[posicion].start();
            } else {
                posicion--;
                if(posicion == 0){
                    iv.setImageResource(R.drawable.genius);
                } else if(posicion == 1){
                    iv.setImageResource(R.drawable.nohay2sin3);
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.paddlingout);
                }else if(posicion == 3){
                    iv.setImageResource(R.drawable.smile);
                }else if(posicion == 4){
                    iv.setImageResource(R.drawable.song2);
                }else if(posicion == 5){
                    iv.setImageResource(R.drawable.stereolove);
                }else if(posicion == 6){
                    iv.setImageResource(R.drawable.takeitoff);
                }else if(posicion == 7){
                    iv.setImageResource(R.drawable.walk);
                }
            }
        } else {
            Toast.makeText(this, "No hay más canciones", Toast.LENGTH_SHORT).show();
        }
    }

    public void VolverMenu(View view){
        Intent volver = new Intent(this,MenuApps.class);
        startActivity(volver);

    }



}