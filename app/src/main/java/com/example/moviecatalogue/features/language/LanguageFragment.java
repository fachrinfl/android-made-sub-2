package com.example.moviecatalogue.features.language;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.moviecatalogue.R;

import java.util.ArrayList;

public class LanguageFragment extends Fragment {

    private ArrayList<LanguageModel> languageModels = new ArrayList<>();
    private LanguageAdapater languageAdapater;
    RecyclerView rvLang;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_language, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        languageModels.addAll(LanguageData.getListLang());
        showRecyclerView();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvLang = view.findViewById(R.id.rv_lang);
        rvLang.setHasFixedSize(true);
    }

    private void showRecyclerView() {
        rvLang.setLayoutManager(new LinearLayoutManager(getContext()));
        languageAdapater = new LanguageAdapater(languageModels);
        rvLang.setAdapter(languageAdapater);
    }
}
