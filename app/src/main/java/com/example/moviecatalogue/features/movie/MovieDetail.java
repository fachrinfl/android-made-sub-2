package com.example.moviecatalogue.features.movie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.moviecatalogue.R;

public class MovieDetail extends AppCompatActivity {

    Toolbar toolbar;
    ImageView ivCover;
    TextView tvTitle, tvCategory, tvDuration, tvRelease;
    TextView tvRate, tvVote, tvSynopsis;
    TextView tvDirector, tvWriters, tvStars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        final MovieModel movieModel = getIntent().getParcelableExtra("DETAIL_MOVIE");

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        ivCover = (ImageView) findViewById(R.id.ivCover);

        Glide.with(this)
                .load(movieModel.getCover())
                .apply(new RequestOptions().override(674, 1000))
                .into(ivCover);

        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvTitle.setText(movieModel.getTitle());

        tvCategory = (TextView) findViewById(R.id.tvCategory);
        tvCategory.setText(movieModel.getCategory());

        tvRate = (TextView) findViewById(R.id.tvRate);
        tvRate.setText(movieModel.getRate());

        tvVote = (TextView) findViewById(R.id.tvVote);
        tvVote.setText(movieModel.getVote());

        tvDuration = (TextView) findViewById(R.id.tvDuration);
        tvDuration.setText(movieModel.getDuration());

        tvRelease = (TextView) findViewById(R.id.tvRelease);
        tvRelease.setText(movieModel.getRelease());

        tvSynopsis = (TextView) findViewById(R.id.tvSynopsis);
        tvSynopsis.setText(movieModel.getDescription());

        tvDirector = (TextView) findViewById(R.id.tvDirector);
        tvDirector.setText(movieModel.getDirector());

        tvWriters = (TextView) findViewById(R.id.tvWriters);
        tvWriters.setText(movieModel.getWriters());

        tvStars = (TextView) findViewById(R.id.tvStars);
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
