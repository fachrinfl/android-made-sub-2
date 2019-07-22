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

    Toolbar toolbar;
    ImageView ivCover;
    TextView tvTitle, tvCategory, tvDuration, tvRelease;
    TextView tvRate, tvVote, tvSynopsis;
    TextView tvDirector, tvWriters, tvStars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tv);
        final TvModel tvModel = getIntent().getParcelableExtra("DETAIL_TV");

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        ivCover = (ImageView) findViewById(R.id.ivCover);

        Glide.with(this)
                .load(tvModel.getCover())
                .apply(new RequestOptions().override(674, 1000))
                .into(ivCover);

        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvTitle.setText(tvModel.getTitle());

        tvCategory = (TextView) findViewById(R.id.tvCategory);
        tvCategory.setText(tvModel.getCategory());

        tvRate = (TextView) findViewById(R.id.tvRate);
        tvRate.setText(tvModel.getRate());

        tvVote = (TextView) findViewById(R.id.tvVote);
        tvVote.setText(tvModel.getVote());

        tvDuration = (TextView) findViewById(R.id.tvDuration);
        tvDuration.setText(tvModel.getDuration());

        tvRelease = (TextView) findViewById(R.id.tvRelease);
        tvRelease.setText(tvModel.getRelease());

        tvSynopsis = (TextView) findViewById(R.id.tvSynopsis);
        tvSynopsis.setText(tvModel.getDescription());

        tvDirector = (TextView) findViewById(R.id.tvDirector);
        tvDirector.setText(tvModel.getDirector());

        tvWriters = (TextView) findViewById(R.id.tvWriters);
        tvWriters.setText(tvModel.getWriters());

        tvStars = (TextView) findViewById(R.id.tvStars);
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
