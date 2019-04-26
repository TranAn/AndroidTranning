package com.example.trainingdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.homefragment, container, false);
        List<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new Contact("033 4196 748", "Quang Ninh province, 2 days ago" ));
        contacts.add(new Contact("090 470 1445", "Vietnam, March 30" ));
        contacts.add(new Contact("038 9983 274", "Nghe An province, March 30" ));

        ContactAdapter adapter = new ContactAdapter(getActivity(),contacts);

        ListView listView = (ListView) view.findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

        return view;

    }
}
