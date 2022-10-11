package com.google.signinsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class home extends AppCompatActivity {
    private Button btnFrofile, btnHocngay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnFrofile = (Button) findViewById(R.id.profile);
        btnFrofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profilr();
            }
        });

        btnHocngay = (Button) findViewById(R.id.hocngay);
        btnHocngay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hocngay();
            }
        });
    }
    public void profilr() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void hocngay() {
        Intent intent = new Intent(this, ListSubjects.class);
        startActivity(intent);
    }

}