package edu.stikom.mobile_shofa6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvBarang;
    ArrayList<Barang> list_barang = new ArrayList<>();
    Adapter br_ada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBarang = findViewById(R.id.rvBarang);
        br_ada = new Adapter(MainActivity.this, list_barang);
        preparedata();


        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this);
        rvBarang.setLayoutManager(mLayoutManager);
        rvBarang.setAdapter(br_ada);
        br_ada.notifyDataSetChanged();
    }

    private void preparedata() {
        Barang br = new Barang();
        br.setKode("111");
        br.setNama("Ice Cream Coklat");
        br.setHarga(40000);
        br.setGambar(R.drawable.w);
        list_barang.add(br);

        br = new Barang();
        br.setKode("222");
        br.setNama("Ice Cream Vanila");
        br.setHarga(40000);
        br.setGambar(R.drawable.q);
        list_barang.add(br);

        br = new Barang();
        br.setKode("333");
        br.setNama("Ice Cream Orange");
        br.setHarga(30000);
        br.setGambar(R.drawable.r);
        list_barang.add(br);

        br = new Barang();
        br.setKode("444");
        br.setNama("Ice Cream Lemon");
        br.setHarga(35000);
        br.setGambar(R.drawable.e);
        list_barang.add(br);

        br_ada.notifyDataSetChanged();
    }
}
