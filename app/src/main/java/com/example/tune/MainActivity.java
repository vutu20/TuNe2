package com.example.tune;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnbatdau,btnthoat,btnluatchoi,btnxephang;private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playSound(R.raw.bg_music);
        btnbatdau=findViewById(R.id.btnbatdau);
        btnthoat=findViewById(R.id.btnthoat);
        btnluatchoi=findViewById(R.id.btnluatchoi);
        btnxephang=findViewById(R.id.btnxephang);
        btnbatdau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(MainActivity.this,BatDau.class);
                startActivity(it);
            }
        });
        btnluatchoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(MainActivity.this,MainHelp.class);
                startActivity(it);
            }
        });
        btnxephang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(MainActivity.this,XepHang.class);
                startActivity(it);
            }
        });
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Khoi tao lai Activity main
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                // Tao su kien ket thuc app
                Intent startMain = new Intent(Intent.ACTION_MAIN);
                startMain.addCategory(Intent.CATEGORY_HOME);
                startActivity(startMain);
                finish();
            }
        });
    }
    public void playSound(int type){
        mediaPlayer = MediaPlayer.create(this, type);
        mediaPlayer.start();
    }
}
