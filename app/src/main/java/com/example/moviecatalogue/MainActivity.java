package com.example.moviecatalogue;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.moviecatalogue.features.language.LanguageFragment;
import com.example.moviecatalogue.features.movie.MovieFragment;
import com.example.moviecatalogue.features.tv.TvFragment;
import com.example.moviecatalogue.helper.LocaleHelper;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navigation;

    public BottomNavigationView.OnNavigationItemSelectedListener
            onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment;
            switch (menuItem.getItemId()) {
                 case R.id.nb_movie:
                    fragment = new MovieFragment();
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(
                                    R.id.container_layout,
                                    fragment,
                                    fragment.getClass().getSimpleName()
                            )
                            .commit();
                    return true;
                case R.id.nb_tv:
                    fragment = new TvFragment();
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(
                                    R.id.container_layout,
                                    fragment,
                                    fragment.getClass().getSimpleName()
                            )
                            .commit();
                    return true;
                case R.id.nb_language:
                    fragment = new LanguageFragment();
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(
                                    R.id.container_layout,
                                    fragment,
                                    fragment.getClass().getSimpleName()
                            )
                            .commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase, "en"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigation = (BottomNavigationView) findViewById(R.id.navigationBottom);
        navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

        // init Paper
        Paper.init(this);

        // Default language is English
        String language = Paper.book().read("language");
        if (language == null)
            Paper.book().write("language", "en");

        updateView((String)Paper.book().read("language"));
    }

    public void updateView(String lang) {
        Context context = LocaleHelper.setLocale(this, lang);
        Resources resources = context.getResources();

        navigation.getMenu().getItem(0).setTitle(resources.getString(R.string.str_movie));
        navigation.getMenu().getItem(1).setTitle(resources.getString(R.string.str_tv));
        navigation.getMenu().getItem(2).setTitle(resources.getString(R.string.str_language));
    }

}
