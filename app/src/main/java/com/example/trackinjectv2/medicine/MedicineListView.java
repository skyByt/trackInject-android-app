package com.example.trackinjectv2.medicine;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.trackinjectv2.R;

import java.util.List;

public class MedicineListView extends ArrayAdapter<Medicine> {
    private Activity context;
    private List<Medicine> list;

    public MedicineListView(Activity context, List<Medicine> list) {
        super(context, R.layout.layout_medicine_list, list);
        this.context = context;
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout_medicine_list, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        String medicine = list.get(position).getName();
        textViewName.setText(medicine);
        return listViewItem;
    }
}

