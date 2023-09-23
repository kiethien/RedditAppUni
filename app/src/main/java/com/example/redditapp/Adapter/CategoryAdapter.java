package com.example.redditapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.widget.ImageView;
import android.widget.TextView;

import com.example.redditapp.Acttivity.CategoryDomain;
import com.example.redditapp.R;
import com.bumptech.glide.Glide;


import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    ArrayList<CategoryDomain> categoryDomain;


    public CategoryAdapter(ArrayList<CategoryDomain> categoryDomain) {
        this.categoryDomain = categoryDomain;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_categories,parent,false);
        return new  ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.categoryName.setText(categoryDomain.get(position).getTiltle());


        String  picUrl="";
        switch (position){
            case 0:{
                picUrl="progamming_icon";
                break;
            }
            case 1:{
                picUrl="earth_porn";
                break;
            }
            case 2:{
                picUrl="fate_reddit";
                break;
            }
            case 3:{
                picUrl="cat_4";
                break;
            }
        }
        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.categoryPic);
    }

    @Override
    public int getItemCount() {
        return categoryDomain.size();
    }
    public class   ViewHolder extends RecyclerView.ViewHolder  {
        TextView    categoryName;
        ImageView   categoryPic;
        ConstraintLayout    mainLayout;
        public ViewHolder(@NonNull View itemView)   {
            super(itemView);
            categoryName=itemView.findViewById(R.id.categoryName);
            categoryPic=itemView.findViewById(R.id.categoryPic);
        }
    }
}
