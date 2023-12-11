package com.nguyentanlap.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nguyentanlap.myapplication.Adapter.DiaDiemCuTheAdapter;
import com.nguyentanlap.myapplication.R;
import com.nguyentanlap.myapplication.classdata.AnhCT;
import com.nguyentanlap.myapplication.classdata.DiaDiem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DiaDiemCuTheActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewDiaDiemCT;
    private DiaDiem item;
    private ArrayList<AnhCT> listAnh = new ArrayList<>();
    private TextView tvTenDD;
    private TextView tvDiaChiDD;
    private TextView tvGioiThieuDD;
    private ImageView imgAnhHP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_diem_cu_the);

        getWidget();
        setVariable();

        recyclerViewDiaDiemCT.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        adapter =new DiaDiemCuTheAdapter(listAnh);
        recyclerViewDiaDiemCT.setAdapter(adapter);
    }

    void setVariable()
    {
        item = (DiaDiem) getIntent().getSerializableExtra("object");
        tvTenDD.setText(item.getDdiem());
        tvDiaChiDD.setText(item.getVitri());
        tvGioiThieuDD.setText(item.getGioiThieu());
        imgAnhHP.setImageResource(getMipmapResID(this.getCurrentFocus(),item.getAnh()));

        listAnh.add(new AnhCT(item.getAnh_p1()));
        listAnh.add(new AnhCT(item.getAnh_p2()));
        listAnh.add(new AnhCT(item.getAnh_p3()));

    }
    private int getMipmapResID(View view, String mipMapName){
        String name = view.getContext().getPackageName();
        return view.getResources().getIdentifier(mipMapName,"mipmap",name);
    }

    void getWidget(){
        tvTenDD= findViewById(R.id.tvtendd);
        tvDiaChiDD = findViewById(R.id.tvDiaChiDD);
        tvGioiThieuDD = findViewById(R.id.tvGioiThieuDD);
        imgAnhHP = findViewById(R.id.img_hpDD);
        recyclerViewDiaDiemCT = findViewById(R.id.rvAnhDD);
    }
}