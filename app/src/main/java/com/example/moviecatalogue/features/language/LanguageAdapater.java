package com.example.moviecatalogue.features.language;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.moviecatalogue.MainActivity;
import com.example.moviecatalogue.R;

import java.util.ArrayList;

import io.paperdb.Paper;

public class LanguageAdapater extends RecyclerView.Adapter<LanguageAdapater.LanguageViewHolder> {

    private ArrayList<LanguageModel> listLang;
    private LanguageFragment languageFragment;

    public LanguageAdapater(ArrayList<LanguageModel> list, LanguageFragment languageFragment) {
        this.listLang = list;
        this.languageFragment = languageFragment;
    }

    @NonNull
    @Override
    public LanguageAdapater.LanguageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_lang, viewGroup, false);
        return new LanguageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final LanguageAdapater.LanguageViewHolder languageViewHolder, int i) {
        final LanguageModel languageModel = listLang.get(i);

        Glide.with(languageViewHolder.itemView.getContext())
                .load(languageModel.getLangImage())
                .apply(new RequestOptions().override(580, 387))
                .into(languageViewHolder.ivLangImage);

        languageViewHolder.tvLangName.setText(languageModel.langName);

        languageViewHolder.mainItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paper.book().write("language", languageModel.langCode);
                if (languageViewHolder.itemView.getContext() instanceof MainActivity) {
                    ((MainActivity)languageViewHolder
                            .itemView
                            .getContext())
                            .updateView((String) Paper.book().read("language"));
                    ((MainActivity)languageViewHolder
                            .itemView
                            .getContext())
                            .showFragment(R.id.nb_language);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return listLang.size();
    }

    public class LanguageViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout mainItem;
        ImageView ivLangImage;
        TextView tvLangName;

        public LanguageViewHolder(@NonNull View itemView) {
            super(itemView);
            mainItem = itemView.findViewById(R.id.mainItem);
            ivLangImage = itemView.findViewById(R.id.ivLang);
            tvLangName = itemView.findViewById(R.id.tvLang);
        }
    }
}
