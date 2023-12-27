package com.nguyentanlap.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
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
    private DiaDiemAdapter adapter;
    private RecyclerView recyclerViewDiaDiem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ArrayList<DiaDiem> dsDiaDiem = new ArrayList<>();

        //Dữ liệu
        dsDiaDiem.add(new DiaDiem("Vinpearl Land","98B/13, Trần Phú, Lộc Thọ.",4.8,
                "vinpearl_hp",
                "Toạ lạc trên đảo Hòn Tre xinh đẹp giữa biển khơi và bãi biển trong xanh quanh năm, Vinpearl Land được biết đến như điểm đến du lịch Nha Trang – “thiên đường của miền nhiệt đới” hấp dẫn mọi du khách.",
                "vinpearl_p1",
                "vinpearl_p2",
                "vinpearl_p3"));
        dsDiaDiem.add(new DiaDiem("Viện Hải dương học","số 1, Cầu Đá, Trần Phú",4.3,
                "vienhdh_hp",
                "Viện Hải dương học Nha Trang là nơi nghiên cứu đời sống các loài động thực vật biển tại thành phố Nha Trang tỉnh Khánh Hòa.Địa điểm du lịch này có trên 20.000 mẫu vật của 4.000 loại sinh vật biển được lưu giữ, sưu tầm và nuôi dưỡng trong nhiều năm.",
                "vienhdh_p1",
                "vienhdh_p2",
                "vienhdh_p3"));
        dsDiaDiem.add(new DiaDiem("Tháp bà Ponagar","Đường 2 Tháng 4, Vĩnh Phước.",4.5,
                "thapba_hp",
                "Tháp bà Ponagar là một trong những quần thể kiến trúc văn hóa Chăm Pa lớn nhất ở miền Trung Việt Nam. Tháp Bà Ponagar được bao trùm bởi màu xanh của cây rừng, như một công trình nổi bật giữa khung nền thiên nhiên xanh mát.",
                "thapba_p1",
                "thapba_p2",
                "thapba_p3"));
        dsDiaDiem.add(new DiaDiem("Nhà thờ Đá Nha Trang","31 Thái Nguyên, Phước Tân.",4.6,
                "nhathoda_hp","Nhà thờ Đá Nha Trang là một địa danh nổi tiếng của thành phố, nơi đây mang nhiều giá trị lịch sử và văn hóa hơn  một nhà thờ tôn giáo thông thường.Nhà thờ Đá Nha Trang được xây dựng hoàn toàn từ những viên đá lập thể theo lối kiến trúc hình khối đặc trưng của Phương Tây.",
                "nhathoda_p1",
                "nhathoda_p2",
                "nhathoda_p3"));
        dsDiaDiem.add(new DiaDiem("Đảo Hòn Tằm"," Vĩnh Nguyên",4.8,
                "hontam_hp",
                "Đảo hòa tằm là một điểm du lịch Nha Trang, trải nghiệm nhất định bạn phải ghé qua khi tới với thành phố. Đảo Hòn Tằm đẹp mộng mơ với những hàng dừa chạy dọc trên bãi biển xanh ngát.",
                "hontam_p1",
                "hontam_p2",
                "hontam_p3"));


        recyclerViewDiaDiem = findViewById(R.id.rvDD);
        recyclerViewDiaDiem.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        adapter = new DiaDiemAdapter(dsDiaDiem);
        recyclerViewDiaDiem.setAdapter(adapter);

        adapter.setOnNotificationItemClickListener(new DiaDiemAdapter.OnNotificationItemClickListener() {
            @Override
            public void onNotificationItemClick(DiaDiem item) {

                Intent intent = new Intent(HomePageActivity.this, DiaDiemCuTheActivity.class);
                //push dữ liệu cho DiaDiemCuTheActivity
                intent.putExtra("diadiem",item.getDdiem() );
                intent.putExtra("diachi",item.getVitri() );
                intent.putExtra("gioithieu",item.getGioiThieu() );
                intent.putExtra("anhhp",item.getAnh() );
                intent.putExtra("anh1",item.getAnh_p1() );
                intent.putExtra("anh2",item.getAnh_p2() );
                intent.putExtra("anh3",item.getAnh_p3() );
                startActivity(intent);
            }
        });

        recyclerViewDiaDiem = findViewById(R.id.rvDD);
        recyclerViewDiaDiem.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        adapter = new DiaDiemAdapter(dsDiaDiem);
        recyclerViewDiaDiem.setAdapter(adapter);

    }
}