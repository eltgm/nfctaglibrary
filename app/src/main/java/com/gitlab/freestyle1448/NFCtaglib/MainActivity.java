package com.gitlab.freestyle1448.NFCtaglib;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.eltgm.nfctaglibrary.NFCInitializer;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        NFCInitializer.init(this, "testTAG");
    }
}
