package com.example.moviecatalogue;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;

import com.example.moviecatalogue.features.language.LanguageFragment;
import com.example.moviecatalogue.features.movie.MovieFragment;
import com.example.moviecatalogue.features.tv.TvFragment;
import com.example.moviecatalogue.helper.LocaleHelper;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    BottomNavigationView navigation;

    public BottomNavigationView.OnNavigationItemSelectedListener
            onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment;
            switch (menuItem.getItemId()) {
                 case R.id.nb_movie:
                     setToolbarTitle(0);
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
                    setToolbarTitle(1);
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
                    setToolbarTitle(2);
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

        Paper.init(this);

        String language = Paper.book().read("language");
        if (language == null)
            Paper.book().write("language", "en");
        final Resources resources = getBaseContext().getResources();

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(resources.getString(R.string.str_toolbar_movie));
        toolbar.setTitleTextColor(getBaseContext().getResources().getColor(R.color.colorTitle));
        setSupportActionBar(toolbar);

        navigation = (BottomNavigationView) findViewById(R.id.navigationBottom);
        navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

        updateView((String)Paper.book().read("language"));
    }

    public void updateView(String lang) {
        Context context = LocaleHelper.setLocale(this, lang);
        final Resources resources = context.getResources();
        navigation.getMenu().getItem(0).setTitle(resources.getString(R.string.str_movie));
        navigation.getMenu().getItem(1).setTitle(resources.getString(R.string.str_tv));
        navigation.getMenu().getItem(2).setTitle(resources.getString(R.string.str_language));
        setToolbarTitle(2);
    }


    private void setToolbarTitle (int position) {
        Context context = LocaleHelper.setLocale(this, (String)Paper.book().read("language"));
        final Resources resources = context.getResources();
        switch (position) {
            case 0:
                toolbar.setTitle(resources.getString(R.string.str_toolbar_movie));
              break;
            case 1:
                toolbar.setTitle(resources.getString(R.string.str_toolbar_tv));
              break;
            case 2:
                toolbar.setTitle(resources.getString(R.string.str_toolbar_language));
              break;
        }
    }

}
