package com.example.tune;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tune.adapter.tienthuongadapter;

import java.util.ArrayList;

public class MainHelp extends AppCompatActivity {
    Button btnsansang;
    ImageButton imbback;
    private MediaPlayer mediaPlayer;
    ListView lvTienthuong;
    tienthuongadapter tienthuongAdapter;
    ArrayList<String> arrTienthuong;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.luatchoi);
        btnsansang=findViewById(R.id.btnsansang);
        imbback=findViewById(R.id.imbback);
        mediaPlayer= MediaPlayer.create(this,R.raw.luatchoi);
        lvTienthuong = findViewById(R.id.lvTienthuong);
        mediaPlayer.start();
        Init();setUp();
        btnsansang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(MainHelp.this,BatDau.class);
                startActivity(it);
                mediaPlayer.stop();
                onBackPressed();
                playSound(R.raw.bg_music);
            }
        });
        imbback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(MainHelp.this,MainActivity.class);
                startActivity(it);
            }
        });
    }
    public void Init() {
        arrTienthuong = new ArrayList<>();
        arrTienthuong.add("1000000");
        arrTienthuong.add("500000");
        arrTienthuong.add("250000");
        arrTienthuong.add("125000");
        arrTienthuong.add("64000");
        arrTienthuong.add("32000");
        arrTienthuong.add("16000");
        arrTienthuong.add("8000");
        arrTienthuong.add("4000");
        arrTienthuong.add("2000");
        arrTienthuong.add("1000");
        arrTienthuong.add("500");
        arrTienthuong.add("300");
        arrTienthuong.add("200");
        arrTienthuong.add("100");
        tienthuongAdapter = new tienthuongadapter(this, 0, arrTienthuong);

    }
    public void setUp() {
        lvTienthuong.setAdapter(tienthuongAdapter);

    }
    public void playSound(int type){
        mediaPlayer = MediaPlayer.create(this, type);
        mediaPlayer.start();
    }
}
