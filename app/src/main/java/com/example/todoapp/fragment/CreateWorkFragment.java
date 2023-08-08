package com.example.todoapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.todoapp.Adapter.TypeAdapter;
import com.example.todoapp.R;
import com.example.todoapp.Type;

import java.util.ArrayList;
import java.util.List;

public class CreateWorkFragment extends Fragment {
    private Spinner spType;
    private View mView ;
    private TypeAdapter typeAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView =  inflater.inflate(R.layout.creatework_fragment,container,false);
        spType = mView.findViewById(R.id.spType);
        typeAdapter = new TypeAdapter(getContext(),R.layout.item_selected,getListType());
        spType.setAdapter(typeAdapter);
        spType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(),typeAdapter.getItem(position).getType(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return mView;
    }

    private List<Type> getListType() {
        List<Type> list = new ArrayList<>();
        list.add(new Type("Task to do"));
        list.add(new Type("Task shared"));
        return list;
    }
}
