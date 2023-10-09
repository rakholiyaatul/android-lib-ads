package com.atul.rakholiya.android_lib_ads;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

public class AdUtils {
    public static boolean isOpen;
    static SharedPreferences sharedPreferences;

    public static String getID() {
        return sharedPreferences.getString("id", "1");
    }

    public static void setID(Context context, String str2) {
        sharedPreferences = context.getSharedPreferences("sharedPref", MODE_PRIVATE);
        sharedPreferences.edit().putString("id", str2).apply();
    }

    public static boolean getSingle() {
        return sharedPreferences.getBoolean("single", false);
    }

    public static void setSingle(Context context, boolean z) {
        sharedPreferences = context.getSharedPreferences("sharedPref", MODE_PRIVATE);
        sharedPreferences.edit().putBoolean("single", z).apply();
    }
}
