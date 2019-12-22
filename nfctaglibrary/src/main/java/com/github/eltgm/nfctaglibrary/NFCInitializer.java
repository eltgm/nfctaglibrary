package com.github.eltgm.nfctaglibrary;

import android.content.Context;
import android.content.SharedPreferences;

public class NFCInitializer {
    static final String NFC_TAG = "NFC_TAG";
    static final String APP_PREFERENCES = "NFC_TAG_LIBRARY";

    public static void init(Context context, String tag) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(NFC_TAG, tag);
        editor.apply();
    }
}
