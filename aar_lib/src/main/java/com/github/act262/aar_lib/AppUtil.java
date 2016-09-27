package com.github.act262.aar_lib;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * App Utility
 */
public class AppUtil {

    public static void show() {
        Log.d("AppUtil", "show: hello lib");
    }

    public static void showToast(Context context, CharSequence sequence) {
        Toast.makeText(context, sequence, Toast.LENGTH_SHORT).show();
    }

    public static void showToast(Context context, String string) {
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
    }

}
