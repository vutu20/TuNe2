package com.example.tune.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.tune.R;

import java.util.ArrayList;
import java.util.List;

public class tienthuongadapter extends ArrayAdapter<String> {
Context nct;
ArrayList<String> arr;
int vitricauhoi=1;
    public tienthuongadapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        this.nct=context;
        this.arr=new ArrayList<>(objects);
    }

    public void setVitricauhoi(int vitricauhoi) {
        this.vitricauhoi = vitricauhoi;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView==null)
        {
            LayoutInflater inflater=(LayoutInflater)nct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.moccauhoi,null);
        }
        if (arr.size()>0){
            int pos=15-position;
            TextView txtmoccauhoi=convertView.findViewById(R.id.txtmoccauhoi);
            if (pos%5==0){
                txtmoccauhoi.setTextColor(Color.parseColor("#FFFFFF"));
            }
            else txtmoccauhoi.setTextColor(Color.parseColor("#FF9800"));
            String khoangtrang;
            if (pos/10>0){
                khoangtrang="     ";
            } else khoangtrang="       ";
            String txtHienThi=pos+khoangtrang+"$"+arr.get(position);
            txtmoccauhoi.setText(txtHienThi);
            if (pos==vitricauhoi){
                txtmoccauhoi.setBackgroundColor(Color.parseColor("#FF9800"));
                txtmoccauhoi.setTextColor(Color.parseColor("#5EDA63"));
            }else txtmoccauhoi.setBackgroundColor(Color.parseColor("#00FFEB3B"));
        }


        return convertView;

    }
}
