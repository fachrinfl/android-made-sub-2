package com.example.moviecatalogue.features.tv;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.moviecatalogue.R;

import java.util.ArrayList;

public class TvFragment extends Fragment {

    private ArrayList<TvModel> tvModels = new ArrayList<>();
    private TvAdapter tvAdapter;
    RecyclerView rvTv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tvModels.addAll(TvData.getListTv());
        showRecyclerView();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvTv = view.findViewById(R.id.rvTv);
        rvTv.setHasFixedSize(true);
    }

    private void showRecyclerView() {
        rvTv.setLayoutManager(new GridLayoutManager(getContext(), 2));
        tvAdapter = new TvAdapter(tvModels);
        rvTv.setAdapter(tvAdapter);

    }
}
