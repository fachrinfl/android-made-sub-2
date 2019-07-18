package com.example.moviecatalogue;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.moviecatalogue.features.language.LanguageFragment;
import com.example.moviecatalogue.features.movie.MovieFragment;
import com.example.moviecatalogue.features.tv.TvFragment;
import com.example.moviecatalogue.helper.LocaleHelper;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    BottomNavigationView navigation;
    Fragment fragment;

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
        toolbar.setTitleTextColor(getBaseContext().getResources().getColor(R.color.colorTitle));
        setSupportActionBar(toolbar);

        navigation = (BottomNavigationView) findViewById(R.id.navigationBottom);
        navigation.setOnNavigationItemSelectedListener(this);
        showFragment(R.id.nb_movie);

        updateView((String)Paper.book().read("language"));
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        showFragment(id);
        return true;
    }

    public void updateView(String lang) {
        Context context = LocaleHelper.setLocale(this, lang);
        final Resources resources = context.getResources();
        navigation.getMenu().getItem(0).setTitle(resources.getString(R.string.str_movie));
        navigation.getMenu().getItem(1).setTitle(resources.getString(R.string.str_tv));
        navigation.getMenu().getItem(2).setTitle(resources.getString(R.string.str_language));
    }


    public void showFragment (int itemId) {
        Context context = LocaleHelper.setLocale(this, (String)Paper.book().read("language"));
        final Resources resources = context.getResources();
        switch (itemId) {
            case R.id.nb_movie:
                toolbar.setTitle(resources.getString(R.string.str_toolbar_movie));
                fragment = new MovieFragment();
              break;
            case R.id.nb_tv:
                toolbar.setTitle(resources.getString(R.string.str_toolbar_tv));
                fragment = new TvFragment();
              break;
            case R.id.nb_language:
                toolbar.setTitle(resources.getString(R.string.str_toolbar_language));
                fragment = new LanguageFragment();
              break;
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_layout, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}
