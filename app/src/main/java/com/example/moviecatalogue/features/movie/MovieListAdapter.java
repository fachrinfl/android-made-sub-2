package com.example.moviecatalogue.features.movie;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.moviecatalogue.R;
import com.example.moviecatalogue.helper.Utils;

import java.util.ArrayList;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder> {

    private ArrayList<MovieModel> listMovie;

    public MovieListAdapter(ArrayList<MovieModel> list) {
        this.listMovie = list;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_movie, viewGroup, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MovieViewHolder movieViewHolder, int i) {
        final MovieModel movieModel = listMovie.get(i);

        Glide.with(movieViewHolder.itemView.getContext())
                .load(movieModel.getCover())
                .apply(new RequestOptions().override(674, 1000))
                .into(movieViewHolder.ivCover);

        movieViewHolder.tvTitle.setText(movieModel.getTitle());
        movieViewHolder.tvTitle.setTextColor(movieViewHolder.itemView.getResources().getColor(R.color.colorTitleMovie));
        movieViewHolder.tvCategory.setText(movieModel.getCategory());
        movieViewHolder.tvYear.setText(movieModel.getYear());

        ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        );
        DisplayMetrics metrics = movieViewHolder.itemView.getResources().getDisplayMetrics();
        if (i == 0) lp.setMargins(0, Utils.toPixels(16, metrics), 0, 0);
        movieViewHolder.mainComponent.setLayoutParams(lp);
        movieViewHolder.mainComponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent movieDetail = new Intent(movieViewHolder.itemView.getContext(), MovieDetail.class);
                movieDetail.putExtra("DETAIL_MOVIE", movieModel);
                movieViewHolder.itemView.getContext().startActivity(movieDetail);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        ImageView ivCover;
        TextView tvTitle, tvCategory, tvYear;
        ConstraintLayout mainComponent;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            ivCover = itemView.findViewById(R.id.ivCover);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvCategory = itemView.findViewById(R.id.tvCategory);
            tvYear = itemView.findViewById(R.id.tvYear);
            mainComponent = itemView.findViewById(R.id.mainComponent);
        }
    }
}
