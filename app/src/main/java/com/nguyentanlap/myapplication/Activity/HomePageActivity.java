package com.nguyentanlap.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.nguyentanlap.myapplication.Adapter.DiaDiemAdapter;
import com.nguyentanlap.myapplication.classdata.DiaDiem;
import com.nguyentanlap.myapplication.R;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewĐiaiem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ArrayList<DiaDiem> dsDiaDiem = new ArrayList<>();

        dsDiaDiem.add(new DiaDiem("Vinpearl","98B/13, Trần Phú, Lộc Thọ",4.8,"vinpearl_hp"));
        dsDiaDiem.add(new DiaDiem("Viện Hải dương học","số 1, Cầu Đá, Trần Phú",4.0,"vienhdh_hp"));
        dsDiaDiem.add(new DiaDiem("Tháp Bà Ponagar"," Đường 2 Tháng 4, Vĩnh Phước",4.5,"thapba_hp"));
        dsDiaDiem.add(new DiaDiem("Nhà thờ Đá Nha Trang","31 Thái Nguyên, Phước Tân",4.8,"nhathoda_hp"));
        dsDiaDiem.add(new DiaDiem("Đảo Hòn Tằm","Vĩnh Nguyên",4.3,"hontam_hp"));

        recyclerViewĐiaiem = findViewById(R.id.rvDD);
        recyclerViewĐiaiem.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        adapter = new DiaDiemAdapter(dsDiaDiem);
        recyclerViewĐiaiem.setAdapter(adapter);



        
    }
}