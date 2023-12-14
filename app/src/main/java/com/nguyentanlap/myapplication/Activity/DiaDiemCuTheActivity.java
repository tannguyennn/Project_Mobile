package com.nguyentanlap.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    private DiaDiemCuTheAdapter adapter;
    private RecyclerView recyclerViewDiaDiemCT;
    private ArrayList<AnhCT> listAnh = new ArrayList<>();
    private TextView tvTenDD;
    private TextView tvDiaChiDD;
    private TextView tvGioiThieuDD;
    private ImageView imgAnhHP;
    private ImageView btnback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_diem_cu_the);

        getWidget();
        setVariable();

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiaDiemCuTheActivity.this,HomePageActivity.class);
                startActivity(intent);
            }
        });

        recyclerViewDiaDiemCT.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        adapter =new DiaDiemCuTheAdapter(listAnh);
        recyclerViewDiaDiemCT.setAdapter(adapter);
    }

    public void setVariable()
    {
        Intent intent = getIntent();
        String dDiem = intent.getStringExtra("diadiem");
        tvTenDD.setText(dDiem);
        String dChi = intent.getStringExtra("diachi");
        tvDiaChiDD.setText("Địa chỉ: "+dChi);
        String gThieu = intent.getStringExtra("gioithieu");
        tvGioiThieuDD.setText(gThieu);
        String anhHP = intent.getStringExtra("anhhp");

        imgAnhHP.setImageResource(getMipmapResID(this.imgAnhHP,anhHP));

        String anh1 = intent.getStringExtra("anh1");
        String anh2 = intent.getStringExtra("anh2");
        String anh3 = intent.getStringExtra("anh3");
        listAnh.add(new AnhCT(anh1));
        listAnh.add(new AnhCT(anh2));
        listAnh.add(new AnhCT(anh3));

    }
    private int getMipmapResID(View view, String mipMapName){
        String name = view.getContext().getPackageName();
        return view.getResources().getIdentifier(mipMapName,"mipmap",name);
    }

    void getWidget(){
        tvTenDD= findViewById(R.id.tvTenDD);
        tvDiaChiDD = findViewById(R.id.tvDiaChiDD);
        tvGioiThieuDD = findViewById(R.id.tvGioiThieuDD);
        imgAnhHP = findViewById(R.id.img_hpDD);
        recyclerViewDiaDiemCT = findViewById(R.id.rvAnhDD);
        btnback = findViewById(R.id.btnback);
    }
}