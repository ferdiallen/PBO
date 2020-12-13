package com.ngoding.android.kulinerindonesia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class ListMenu extends AppCompatActivity {
    private RecyclerView viewFood;
    private ArrayList<Food> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);

        viewFood = findViewById(R.id.rv_food);
        viewFood.setHasFixedSize(true);

        list.addAll(FoodData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        viewFood.setLayoutManager(new LinearLayoutManager(this));
        final FoodAdapter foodAdapter = new FoodAdapter(list);
        viewFood.setAdapter(foodAdapter);

        foodAdapter.setOnItemClickCallback(new FoodAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Food data) {
                showRecyclerList();
                Intent intent = new Intent(ListMenu.this, FoodDetail.class);
                Intent moveInten = new Intent(ListMenu.this, FoodDetail.class);
                moveInten.putExtra(FoodDetail.EXTRA_IMG, data.getPhoto());
                moveInten.putExtra(FoodDetail.EXTRA_NAME, data.getName());
                moveInten.putExtra(FoodDetail.EXTRA_DETAIL, data.getDetail());
                moveInten.putExtra(FoodDetail.EXTRA_BAHAN, data.getBahan());
                moveInten.putExtra(FoodDetail.EXTRA_MASAK, data.getMemasak());
                startActivity(moveInten);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.personal_data, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.person:
                Intent personalInten = new Intent(ListMenu.this, PersonalProfile.class);
                startActivity(personalInten);
                break;
        }
    }
}
