package com.example.moviecatalogue.features.movie;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.moviecatalogue.R;

public class MovieDetail extends AppCompatActivity {

    CollapsingToolbarLayout collapsingToolbarLayout;
    Toolbar toolbar;
    ImageView ivCover;
    TextView tvCategory, tvDuration, tvRelease, tvLabelDuration, tvLabelRelease;
    TextView tvRate, tvVote, tvLabelSynopsis, tvSynopsis;
    TextView tvLabelDirector, tvDirector, tvLabelWriters, tvWriters, tvLabelStars, tvStars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        final MovieModel movieModel = getIntent().getParcelableExtra("DETAIL_MOVIE");

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        ivCover = findViewById(R.id.ivCover);

        Glide.with(this)
                .load(movieModel.getCover())
                .apply(new RequestOptions().override(674, 1000))
                .into(ivCover);

        collapsingToolbarLayout = findViewById(R.id.collapsingToolbarLayout);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.TextAppearance_MyApp_Title_Expanded);
        collapsingToolbarLayout.setTitle(movieModel.getTitle());

        tvLabelDuration = findViewById(R.id.tvLabelDuration);
        tvLabelRelease = findViewById(R.id.tvLabelRelease);
        tvLabelSynopsis = findViewById(R.id.tvLabelSynopsis);
        tvLabelDirector = findViewById(R.id.tvLabelDirector);
        tvLabelWriters = findViewById(R.id.tvLabelWriters);
        tvLabelStars = findViewById(R.id.tvLabelStars);

        tvCategory = findViewById(R.id.tvCategory);
        tvCategory.setText(movieModel.getCategory());

        tvDuration = findViewById(R.id.tvDuration);
        tvDuration.setText(movieModel.getDuration());

        tvRelease = findViewById(R.id.tvRelease);
        tvRelease.setText(movieModel.getRelease());

        tvRate = findViewById(R.id.tvRate);
        tvRate.setText(movieModel.getRate());

        tvVote = findViewById(R.id.tvVote);
        tvVote.setText(movieModel.getVote());

        tvSynopsis = findViewById(R.id.tvSynopsis);
        tvSynopsis.setText(movieModel.getDescription());

        tvDirector = findViewById(R.id.tvDirector);
        tvDirector.setText(movieModel.getDirector());

        tvWriters = findViewById(R.id.tvWriters);
        tvWriters.setText(movieModel.getWriters());

        tvStars = findViewById(R.id.tvStars);
        tvStars.setText(movieModel.getStars());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
