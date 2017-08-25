package com.example.rahmatridham.projectsunshine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
//                Toast.makeText(MainMenu.this, dataCuaca.get(i).getTanggal(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainMenu.this, DetailActivity.class);
                intent.putExtra("status", dataCuaca.get(i).getStatus());
                intent.putExtra("tanggal", dataCuaca.get(i).getTanggal());
                intent.putExtra("humidity", dataCuaca.get(i).getHumidity());
                intent.putExtra("pressure", dataCuaca.get(i).getPresure());
                intent.putExtra("wind", dataCuaca.get(i).getWind());
                intent.putExtra("suhuatas", dataCuaca.get(i).getSuhuAtas());
                intent.putExtra("suhubawah", dataCuaca.get(i).getSuhuBawah());

                startActivity(intent);
            }
        });

        getAllMahasiswa();
    }


    private void dataDummy() {
        dataCuaca.add(new Cuaca("Panas", "20/Oktober/2017", 22, 21, 10, 15, 12));
        dataCuaca.add(new Cuaca("Dingin", "21/April/2017", 18, 12, 100, 25, 22));
        dataCuaca.add(new Cuaca("Berawan", "22/Februari/2017", 25, 21, 10, 15, 12));
        dataCuaca.add(new Cuaca("Badai", "10/Oktober/2017", 27, 20, 10, 15, 12));
    }

    public void getAllMahasiswa() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, "http://api-android.herokuapp.com/mahasiswa",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(MainMenu.this, response, Toast.LENGTH_SHORT).show();


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainMenu.this, "Gagal", Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> param = new HashMap<>();
                param.put("username", "rahmatridham");
                param.put("password", "1231252876");

                return param;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

}
