package com.nguyentanlap.myapplication.Adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nguyentanlap.myapplication.Activity.DiaDiemCuTheActivity;
import com.nguyentanlap.myapplication.classdata.DiaDiem;
import com.nguyentanlap.myapplication.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class DiaDiemAdapter extends RecyclerView.Adapter<DiaDiemAdapter.ViewHolder> {
    ArrayList<DiaDiem> dsDD;

    private OnNotificationItemClickListener listener;

    //Tạo sự kiện click item cho adapter
    public void setOnNotificationItemClickListener(OnNotificationItemClickListener listener) {
        this.listener = listener;
    }

    //phươn thức khởi tạo
    public DiaDiemAdapter(ArrayList<DiaDiem> dsDD) {
        this.dsDD = dsDD;
    }

    @NonNull
    @Override
    public DiaDiemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_diadiem,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull DiaDiemAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.tvdiadiem.setText(dsDD.get(position).getDdiem());
        holder.tvvitri.setText(""+dsDD.get(position).getDiem());
        holder.tvvitri.setText(dsDD.get(position).getVitri());
        holder.imgAnh.setImageResource(getMipmapResID(holder.itemView,dsDD.get(position).getAnh()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition = holder.getAdapterPosition();
                if (listener != null && currentPosition != RecyclerView.NO_POSITION) {
                    listener.onNotificationItemClick(dsDD.get(currentPosition));
                }
            }
        });

    }
    public interface OnNotificationItemClickListener{
        void onNotificationItemClick(DiaDiem item);
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
