package com.example.rahmatridham.projectsunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainMenu extends AppCompatActivity {
    private AdapterCuaca adapter;
    private ArrayList<Cuaca> dataCuaca = new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        listView = (ListView) findViewById(R.id.listCuaca);
        dataDummy();
        adapter = new AdapterCuaca(dataCuaca, getApplicationContext());
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainMenu.this, dataCuaca.get(i).getTanggal(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void dataDummy() {
        dataCuaca.add(new Cuaca("Panas", "20/Oktober/2017", 22, 21, 10, 15, 12));
        dataCuaca.add(new Cuaca("Dingin", "21/April/2017", 18, 12, 100, 25, 22));
        dataCuaca.add(new Cuaca("Berawan", "22/Februari/2017", 25, 21, 10, 15, 12));
        dataCuaca.add(new Cuaca("Badai", "10/Oktober/2017", 27, 20, 10, 15, 12));
    }
}
