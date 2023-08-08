package com.example.todoapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.todoapp.R;
import com.example.todoapp.Type;

import java.util.List;

public class TypeAdapter extends ArrayAdapter<Type> {
    public TypeAdapter(@NonNull Context context, int resource, @NonNull List<Type> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_selected,parent,false);

        TextView tvSelected =convertView.findViewById(R.id.tvSelected);
        Type type = this.getItem(position);
        if(type != null){
            tvSelected.setText(type.getType());
        }

        return convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type,parent,false);

        TextView tvType =convertView.findViewById(R.id.tvType);
        Type type = this.getItem(position);
        if(type != null){
            tvType.setText(type.getType());
        }

        return convertView;
    }
}
