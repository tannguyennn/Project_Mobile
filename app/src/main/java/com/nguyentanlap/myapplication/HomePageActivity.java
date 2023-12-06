package com.nguyentanlap.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewĐiaiem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ArrayList<DiaDiem> dsDiaDiem = new ArrayList<>();

        dsDiaDiem.add(new DiaDiem("Vinpearl","Hòn Tre,Vĩnh Nguyên",4.8,"nhatrang_hp"));
        dsDiaDiem.add(new DiaDiem("Dảo khỉ","xã Ninh Phú, Ninh Hoà",4.0,"doakhi_hp"));
        dsDiaDiem.add(new DiaDiem("Tháp Bà Ponagar"," Đường 2 Tháng 4, Vĩnh Phước",4.5,"thapba_hp"));
        dsDiaDiem.add(new DiaDiem("Vịnh vân phong","Vạn Ninh",4.8,"vinhvanphong_hp"));
        dsDiaDiem.add(new DiaDiem("Thác Yangbay","Khánh Phú, Khánh Vĩnh",4.3,"yangbay_hp"));

        recyclerViewĐiaiem = findViewById(R.id.rvDD);
        recyclerViewĐiaiem.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        adapter = new DiaDiemAdapter(dsDiaDiem);
        recyclerViewĐiaiem.setAdapter(adapter);

        
    }
}