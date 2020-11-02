package com.example.tune;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class XepHang extends AppCompatActivity {
    ImageButton imbback1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xephang);
        imbback1=findViewById(R.id.imbback1);
        imbback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(XepHang.this,MainActivity.class);
                startActivity(it);
            }
        });
    }
}
