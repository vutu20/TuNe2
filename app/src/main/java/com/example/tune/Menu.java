package com.example.tune;

import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class Menu extends AppCompatActivity {
    Button btnamthanh,btnchoilai,btnquaylai;
    boolean kt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        btnamthanh=findViewById(R.id.btnamthanh);
        btnchoilai=findViewById(R.id.btnchoilai);
        btnquaylai=findViewById(R.id.btnquaylai);
        final AudioManager audioManager;
        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        btnchoilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Menu.this,BatDau.class);
                startActivity(it);

            }
        });
        btnamthanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kt==true) {
                    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, AudioManager.ADJUST_MUTE, AudioManager.FLAG_SHOW_UI);
                    btnamthanh.setText("Âm thanh: Bật");
                    kt=false;
                }
                else{
                    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,7,AudioManager.FLAG_SHOW_UI);
                //audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,AudioManager.ADJUST_UNMUTE, AudioManager.FLAG_SHOW_UI);
                btnamthanh.setText("Âm thanh: Tắt");
                kt=true;}
            }
        });
        btnquaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Menu.this,MainActivity.class);
                startActivity(it);
            }
        });
    }
}
