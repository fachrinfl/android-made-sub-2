package com.example.moviecatalogue.helper;

import android.util.DisplayMetrics;
import android.util.TypedValue;

public class Utils {
    public static int toPixels(int dp, DisplayMetrics metrics) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, metrics);
    }
}
