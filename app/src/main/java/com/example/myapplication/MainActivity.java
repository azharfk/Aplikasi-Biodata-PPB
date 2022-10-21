package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void map(View view) {
        Uri uri = Uri.parse("geo:-6.973316383253525, 110.39310779439097");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void telepon(View view) {
        Uri uri = Uri.parse("tel:085755827587");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"111202113923@mhs.dinus.ac.id"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email");

        try {
            startActivity(Intent.createChooser(intent, "Email"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }


}