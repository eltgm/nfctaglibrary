package com.gitlab.freestyle1448.NFCtaglib;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.gitlab.freestyle1448.nfctaglibrary.NFCInitializer;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        NFCInitializer.init(this, "testTAG");
    }
}
