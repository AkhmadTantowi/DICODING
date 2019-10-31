package com.example.listsekolah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSekolah;
    private ArrayList<Sekolah> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvSekolah = findViewById(R.id.rv_sekolah);
        rvSekolah.setHasFixedSize(true);

        list.addAll(SekolahData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvSekolah.setLayoutManager(new LinearLayoutManager(this));
        ListSekolahAdapter listSekolahAdapter = new ListSekolahAdapter(list);
        rvSekolah.setAdapter(listSekolahAdapter);

        listSekolahAdapter.setOnItemClickCallback(new ListSekolahAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Sekolah data) {
                showSelectedData(data);
            }
        });
    }

    public void showSelectedData(Sekolah l) {
        Intent detail = new Intent(MainActivity.this, DetailSekolah.class);
        detail.putExtra(DetailSekolah.EXTRA_NAMASEKOLAH, l.getName());
        detail.putExtra(DetailSekolah.EXTRA_BERDIRI, l.getBerdiri());
        detail.putExtra(DetailSekolah.EXTRA_PENGERTIAN, l.getDetail());
        detail.putExtra(DetailSekolah.EXTRA_SEJARAH, l.getSejarah());
        detail.putExtra(DetailSekolah.EXTRA_IMG, l.getPhoto());
        startActivity(detail);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent about = new Intent(MainActivity.this, About.class);
        startActivity(about);
        return super.onOptionsItemSelected(item);
    }
}