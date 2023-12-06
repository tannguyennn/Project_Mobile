package com.nguyentanlap.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class DiaDiemAdapter extends RecyclerView.Adapter<DiaDiemAdapter.ViewHolder> {
    ArrayList<DiaDiem> dsDD;
    DecimalFormat format;

    public DiaDiemAdapter(ArrayList<DiaDiem> dsDD) {
        this.dsDD = dsDD;
        format = new DecimalFormat("###,###,###,###,###");
    }

    @NonNull
    @Override
    public DiaDiemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_diadiem,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull DiaDiemAdapter.ViewHolder holder, int position) {
        holder.tvdiadiem.setText(dsDD.get(position).getDdiem());
        holder.tvvitri.setText(""+dsDD.get(position).getDiem());
        holder.tvvitri.setText(dsDD.get(position).getVitri());
        holder.imgAnh.setImageResource(getMipmapResID(holder.itemView,dsDD.get(position).getAnh()));
    }

    private int getMipmapResID(View view, String mipMapName){
        String name = view.getContext().getPackageName();
        return view.getResources().getIdentifier(mipMapName,"mipmap",name);
    }

    @Override
    public int getItemCount() {
        return dsDD.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvdiadiem,tvvitri,tvdiem;
        ImageView imgAnh;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvdiadiem = itemView.findViewById(R.id.tvtendd);
            tvvitri = itemView.findViewById(R.id.tvvitri);
            tvdiem = itemView.findViewById(R.id.tvdiem);
            imgAnh = itemView.findViewById(R.id.imgpic);
        }
    }
}
