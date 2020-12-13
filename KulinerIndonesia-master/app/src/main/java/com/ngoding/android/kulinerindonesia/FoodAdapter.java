package com.ngoding.android.kulinerindonesia;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ListViewHolder> {
    private ArrayList<Food> itemFood;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public FoodAdapter(ArrayList<Food> list) {
        this.itemFood = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_makanan, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Food food = itemFood.get(position);
        Glide.with(holder.itemView.getContext())
                .load(food.getPhoto())
                .apply(new RequestOptions().override(125, 80))
                .into(holder.imgItem);
        holder.itemName.setText(food.getName());
        holder.itemDetail.setText(food.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(food);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemFood.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgItem;
        TextView itemName, itemDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgItem = itemView.findViewById(R.id.img_item);
            itemName = itemView.findViewById(R.id.item_name);
            itemDetail = itemView.findViewById(R.id.item_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Food data);
    }
}
