package com.nguyentanlap.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nguyentanlap.myapplication.Adapter.DiaDiemAdapter;
import com.nguyentanlap.myapplication.classdata.DiaDiem;
import com.nguyentanlap.myapplication.R;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewDiaDiem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ArrayList<DiaDiem> dsDiaDiem = new ArrayList<>();

        String fileName = "diadiemcuthe.txt";
        String ma,ten,diaChi,gioiThieu,anhhp,anh1,anh2,anh3;
        double diem;
        try {
            AssetManager assetManager = context.getAssets();
            InputStream inputStream = assetManager.open(fileName);
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            ma = in.readLine();
            while (ma != null) {
                ten = in.readLine();
                diaChi = in.readLine();
                diem = Double.parseDouble(in.readLine());
                gioiThieu = in.readLine();
                anhhp = in.readLine();
                anh1 = in.readLine();
                anh2 = in.readLine();
                anh3 = in.readLine();

                dsDiaDiem.add(new DiaDiem(ten,diaChi,diem,gioiThieu,anhhp,anh1,anh2,anh3));
            }
            in.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        recyclerViewDiaDiem = findViewById(R.id.rvDD);
        recyclerViewDiaDiem.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        adapter = new DiaDiemAdapter(dsDiaDiem);
        recyclerViewDiaDiem.setAdapter(adapter);



        
    }
}