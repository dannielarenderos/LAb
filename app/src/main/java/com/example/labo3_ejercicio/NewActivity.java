package com.example.labo3_ejercicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.labo3_ejercicio.utils.info;

public class NewActivity extends AppCompatActivity {

    private TextView tv_user,tv_pass,tv_email,tv_gender;
    private ImageView imgshare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        tv_user = findViewById(R.id.tv_username);
        tv_pass = findViewById(R.id.tv_password);
        tv_email = findViewById(R.id.tv_email);
        tv_gender = findViewById(R.id.tv_gender);
        Intent mIntent = this.getIntent();
        if (mIntent != null) {
            info info = mIntent.getParcelableExtra("info");

            tv_user.setText( info.getUser());
            tv_pass.setText( info.getPass());
            tv_email.setText( info.getEmail());
            tv_gender.setText( info.getGender());

        }

        imgshare =findViewById(R.id.img_share);
        imgshare.setOnClickListener(v -> {

            String user = (String) tv_user.getText();
            String email = (String) tv_email.getText();

            String info = "Nombre:" + user + "   Email:" + email;
            Intent Intent = new Intent();
            Intent.setAction(Intent.ACTION_SEND);
            Intent.setType("text/plain");
            Intent.putExtra(Intent.EXTRA_TEXT, info);
            startActivity(Intent);
        });
    }
}
