package com.example.moviecatalogue;

import android.app.Application;
import android.content.Context;

import com.example.moviecatalogue.helper.LocaleHelper;

public class MainApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base, "en"));
    }
}
