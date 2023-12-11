package com.nguyentanlap.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.nguyentanlap.myapplication.R;
import com.nguyentanlap.myapplication.classdata.AnhCT;
import com.nguyentanlap.myapplication.classdata.DiaDiemCuThe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DiaDiemCuTheActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewĐiaiemCT;
    private TextView tvTenDD;
    private TextView tvDiaChiDD;
    private TextView tvGioiThieuDD;
    private ImageView imgAnhHP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_diem_cu_the);

        getWidget();

        ArrayList<DiaDiemCuThe> listDD = new ArrayList<>();
        ArrayList<AnhCT> listAnh = new ArrayList<>();



        String fileName = "diadiemcuthe.txt";
        String ma,ten,diaChi,gioiThieu,anhhp,anh1,anh2,anh3;
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            ma = in.readLine();
            while (ma != null) {
                ten = in.readLine();
                diaChi = in.readLine();
                gioiThieu = in.readLine();
                anhhp = in.readLine();
                anh1 = in.readLine();
                anh2 = in.readLine();
                anh3 = in.readLine();


            }
            in.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    void getWidget(){
        tvTenDD= findViewById(R.id.tvtendd);
        tvDiaChiDD = findViewById(R.id.tvDiaChiDD);
        tvGioiThieuDD = findViewById(R.id.tvGioiThieuDD);
        imgAnhHP = findViewById(R.id.img_hpDD);
        recyclerViewĐiaiemCT = findViewById(R.id.rvAnhDD);
    }
}