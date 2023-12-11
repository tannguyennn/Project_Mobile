package com.nguyentanlap.myapplication.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nguyentanlap.myapplication.R;
import com.nguyentanlap.myapplication.classdata.AnhCT;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class DiaDiemCuTheAdapter extends RecyclerView.Adapter<DiaDiemCuTheAdapter.ViewHolder> {
    ArrayList<AnhCT> listAnh;
    DecimalFormat format;

    public DiaDiemCuTheAdapter(ArrayList<AnhCT> listAnh) {
        this.listAnh = listAnh;
        format = new DecimalFormat();
    }

    @NonNull
    @Override
    public DiaDiemCuTheAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_diadiem_cuthe,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull DiaDiemCuTheAdapter.ViewHolder holder, int position) {
        holder.imgAnhCT.setImageResource(getMipmapResID(holder.itemView,listAnh.get(position).getAnh()));

    }
    private int getMipmapResID(View view, String mipMapName){
        String name = view.getContext().getPackageName();
        return view.getResources().getIdentifier(mipMapName,"mipmap",name);
    }

    @Override
    public int getItemCount() {
        return listAnh.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAnhCT;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgAnhCT = itemView.findViewById(R.id.imgAnhCT);
        }
    }
}
