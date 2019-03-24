package com.example.labo3_ejercicio;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.labo3_ejercicio.utils.AppConstants;
import com.example.labo3_ejercicio.utils.info;

public class MainActivity extends AppCompatActivity {

    private EditText et_user,et_pass,et_email,et_gen;
    private Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_user=findViewById(R.id.et_username);
        et_pass=findViewById(R.id.et_password);
        et_email=findViewById(R.id.et_email);
        et_gen=findViewById(R.id.et_gender);

        btnsend=findViewById(R.id.btn_send);
        btnsend.setOnClickListener(v -> {
            info info = new info(et_user.getText().toString(),
                    et_pass.getText().toString(),
                    et_email.getText().toString(),
                    et_gen.getText().toString());

            Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY,info);
            startActivity(mIntent);
        });

    }

    }

