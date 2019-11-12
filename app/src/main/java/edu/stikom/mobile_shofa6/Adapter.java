package edu.stikom.mobile_shofa6;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private Context mContext;
    private ArrayList<Barang> list_barang = new ArrayList<>();

    public Adapter(Context mContext, ArrayList<Barang> list_barang) {
        this.mContext = mContext;
        this.list_barang = list_barang;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_barang, viewGroup, false);
        return new Adapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Barang b = list_barang.get(i);

        myViewHolder.nama.setText(String.valueOf(b.getNama()));
        myViewHolder.harga.setText("Rp. " +String.valueOf(b.getHarga()));
        myViewHolder.gambar.setImageResource(b.getGambar());
    }

    @Override
    public int getItemCount() {
        return list_barang.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView gambar;
        TextView nama, harga;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.img);
            nama = itemView.findViewById(R.id.txt1);
            harga = itemView.findViewById(R.id.txt2);

        }
    }
}
