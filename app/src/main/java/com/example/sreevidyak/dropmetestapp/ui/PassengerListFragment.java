package com.example.sreevidyak.dropmetestapp.ui;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sreevidyak.dropmetestapp.R;
import com.example.sreevidyak.dropmetestapp.adapter.PassengerRecyclerAdpter;
import com.example.sreevidyak.dropmetestapp.model.PassengerInfo;

import java.util.ArrayList;
import java.util.List;


public class PassengerListFragment extends Fragment {
    private PassengerRecyclerAdpter mAdapter;
    private ArrayList<PassengerInfo> mList;
    private RecyclerView mRecyclerView;
       public PassengerListFragment() {

    }


    public static PassengerListFragment newInstance(String param1, String param2) {
        PassengerListFragment fragment = new PassengerListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_passenger_list, container, false);
        mRecyclerView = (RecyclerView)view.findViewById(R.id.passenger_recycler);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setAdapter();
    }

    private void setAdapter() {
        addData();
        mAdapter = new PassengerRecyclerAdpter(mList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    private void addData() {
        mList =  new ArrayList<>();
        for(int i = 0;i < 10;i++){
            PassengerInfo info = new PassengerInfo("Lyryl",26);
            mList.add(info);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }


}
