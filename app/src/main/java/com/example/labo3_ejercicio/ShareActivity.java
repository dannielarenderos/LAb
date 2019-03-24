package com.example.labo3_ejercicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.labo3_ejercicio.utils.info;

public class ShareActivity extends AppCompatActivity {
    private TextView tv_user, tv_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        String user = (String) tv_user.getText();
        String email = (String) tv_email.getText();

        Intent Intent = getIntent();
        if (Intent != null) {
            tv_user.setText(Intent.getStringExtra(Intent.EXTRA_TEXT));
            tv_email.setText(Intent.getStringExtra(Intent.EXTRA_TEXT));

        }
    }
}
