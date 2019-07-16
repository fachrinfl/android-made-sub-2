package com.example.moviecatalogue;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.moviecatalogue.features.language.LanguageFragment;
import com.example.moviecatalogue.features.movie.MovieFragment;
import com.example.moviecatalogue.features.tv.TvFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener
            onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment;
            switch (menuItem.getItemId()) {
                 case R.id.nb_movie:
                     Toast.makeText(getBaseContext(), R.string.str_movie, Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getBaseContext(), R.string.str_tv, Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getBaseContext(), R.string.str_language, Toast.LENGTH_SHORT).show();
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationBottom);
        navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
    }
}
