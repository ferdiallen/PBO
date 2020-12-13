package com.ngoding.android.kulinerindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class PersonalProfile extends AppCompatActivity{

    ProfileData profile = new ProfileData();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnchange;
        super.onCreate(savedInstanceState);
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_personal_profile);

        TextView namaP = findViewById(R.id.namaP);
        TextView emailP = findViewById(R.id.email);
        TextView tahunP = findViewById(R.id.tahuns);

        namaP.setText(profile.nama());
        emailP.setText(profile.email());
        btnchange = findViewById(R.id.ubahIT);
        btnchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namaP.setText(profile.ubah("Allens"));
                tahunP.setText(String.valueOf(profile.ubah(2019)));

            }
        });
    }

}