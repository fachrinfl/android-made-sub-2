package com.example.moviecatalogue.features.tv;

import android.content.Intent;
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
import com.example.moviecatalogue.R;

import java.util.ArrayList;

public class TvAdapter extends RecyclerView.Adapter<TvAdapter.TvViewHolder> {

    private ArrayList<TvModel> listTv;

    public TvAdapter(ArrayList<TvModel> list) {this.listTv = list;}

    @NonNull
    @Override
    public TvViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_tv, viewGroup, false);
        return new TvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final TvViewHolder tvViewHolder, int i) {
        final TvModel tvModel = listTv.get(i);

        Glide.with(tvViewHolder.itemView.getContext())
                .load(tvModel.getCover())
                .apply(new RequestOptions().override(674, 1000))
                .into(tvViewHolder.ivCover);

        tvViewHolder.tvTitle.setText(tvModel.getTitle());
        tvViewHolder.mainComponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tvDetail = new Intent(tvViewHolder.itemView.getContext(), DetailTvActivity.class);
                tvDetail.putExtra("DETAIL_TV", tvModel);
                tvViewHolder.itemView.getContext().startActivity(tvDetail);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listTv.size();
    }

    public class TvViewHolder extends RecyclerView.ViewHolder {

        ImageView ivCover;
        TextView tvTitle;
        ConstraintLayout mainComponent;

        public TvViewHolder(@NonNull View itemView) {
            super(itemView);
            ivCover = (ImageView) itemView.findViewById(R.id.ivTvCover);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTvTitle);
            mainComponent = itemView.findViewById(R.id.mainComponent);
        }
    }
}
