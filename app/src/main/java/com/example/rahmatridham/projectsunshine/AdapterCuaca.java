package com.example.rahmatridham.projectsunshine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.constraint.R.id.parent;

/**
 * Created by rahmatridham on 8/18/2017.
 */

public class AdapterCuaca extends BaseAdapter {
    private ArrayList<Cuaca> listCuaca = new ArrayList<>();
    private Context context;

    public AdapterCuaca(ArrayList<Cuaca> listCuaca, Context context) {
        this.listCuaca = listCuaca;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listCuaca.size();
    }

    @Override
    public Cuaca getItem(int i) {
        return listCuaca.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.list_row, viewGroup, false);

        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        TextView status = (TextView) v.findViewById(R.id.textView2);
        TextView tanggal = (TextView) v.findViewById(R.id.textView5);
        TextView suhuAtas = (TextView) v.findViewById(R.id.textView6);
        TextView suhuBawah = (TextView) v.findViewById(R.id.textView7);

        status.setText(listCuaca.get(i).getStatus());
        tanggal.setText(listCuaca.get(i).getTanggal());
        suhuAtas.setText(Integer.toString(listCuaca.get(i).getSuhuAtas()));
        suhuBawah.setText(Integer.toString(listCuaca.get(i).getSuhuBawah()));

        return v;
    }
}
