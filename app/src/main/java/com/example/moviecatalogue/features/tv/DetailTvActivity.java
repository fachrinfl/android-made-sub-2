package com.example.moviecatalogue.features.tv;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.moviecatalogue.R;

public class DetailTvActivity extends AppCompatActivity {

    CollapsingToolbarLayout collapsingToolbarLayout;
    Toolbar toolbar;
    ImageView ivCover;
    TextView tvCategory, tvDuration, tvRelease, tvLabelDuration, tvLabelRelease;
    TextView tvRate, tvVote, tvLabelSynopsis, tvSynopsis;
    TextView tvLabelDirector, tvDirector, tvLabelWriters, tvWriters, tvLabelStars, tvStars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tv);
        final TvModel tvModel = getIntent().getParcelableExtra("DETAIL_TV");

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        ivCover = findViewById(R.id.ivTvCover);

        Glide.with(this)
                .load(tvModel.getCover())
                .apply(new RequestOptions().override(674, 1000))
                .into(ivCover);

        collapsingToolbarLayout = findViewById(R.id.collapsingToolbarLayout);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.TextAppearance_MyApp_Title_Expanded);
        collapsingToolbarLayout.setTitle(tvModel.getTitle());

        tvLabelDuration = findViewById(R.id.tvLabelDuration);
        tvLabelRelease = findViewById(R.id.tvLabelRelease);
        tvLabelSynopsis = findViewById(R.id.tvLabelSynopsis);
        tvLabelDirector = findViewById(R.id.tvLabelDirector);
        tvLabelWriters = findViewById(R.id.tvLabelWriters);
        tvLabelStars = findViewById(R.id.tvLabelStars);

        tvCategory = findViewById(R.id.tvCategory);
        tvCategory.setText(tvModel.getCategory());

        tvDuration = findViewById(R.id.tvDuration);
        tvDuration.setText(tvModel.getDuration());

        tvRelease = findViewById(R.id.tvRelease);
        tvRelease.setText(tvModel.getRelease());

        tvRate = findViewById(R.id.tvRate);
        tvRate.setText(tvModel.getRate());

        tvVote = findViewById(R.id.tvVote);
        tvVote.setText(tvModel.getVote());

        tvSynopsis = findViewById(R.id.tvSynopsis);
        tvSynopsis.setText(tvModel.getDescription());

        tvDirector = findViewById(R.id.tvDirector);
        tvDirector.setText(tvModel.getDirector());

        tvWriters = findViewById(R.id.tvWriters);
        tvWriters.setText(tvModel.getWriters());

        tvStars = findViewById(R.id.tvStars);
        tvStars.setText(tvModel.getStars());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
