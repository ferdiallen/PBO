package com.ngoding.android.kulinerindonesia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FoodDetail extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_IMG = "extra_img";
    public static final String EXTRA_BAHAN = "extra_bahan";
    public static final String EXTRA_MASAK = "extra_masak";

    ImageView imgItem;
    TextView itemName, itemDetail, itemBahan, itemMasak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_food_detail);

        imgItem = findViewById(R.id.iimg);
        itemName = findViewById(R.id.iname);
        itemDetail = findViewById(R.id.idetail);
        itemBahan = findViewById(R.id.nama_bahan);
        itemMasak = findViewById(R.id.memasak);

        Glide.with(this)
                .load(getIntent().getIntExtra(EXTRA_IMG,0))
                .into(imgItem);
        itemName.setText(getIntent().getStringExtra(EXTRA_NAME));
        itemDetail.setText(getIntent().getStringExtra(EXTRA_DETAIL));
        itemBahan.setText(getIntent().getStringExtra(EXTRA_BAHAN));
        itemMasak.setText(getIntent().getStringExtra(EXTRA_MASAK));

        Toast.makeText(getApplicationContext(), "Selamat Membaca", Toast.LENGTH_SHORT).show();
    }
}
