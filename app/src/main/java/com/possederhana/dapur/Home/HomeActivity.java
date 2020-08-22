package com.possederhana.dapur.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.possederhana.dapur.DaftarMenu.DaftarMenuActivity;
import com.possederhana.dapur.DaftarTransaksi.DaftarTransaksiActivity;
import com.possederhana.dapur.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void openDaftarMenu(View view) {
        Intent ListVideo = new Intent(getApplicationContext(), DaftarMenuActivity.class);
        startActivity(ListVideo);
    }

    public void openDaftaTransaksi(View view) {
        Intent ListVideo = new Intent(getApplicationContext(), DaftarTransaksiActivity.class);
        startActivity(ListVideo);
    }
}