package com.example.redditapp.Adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.redditapp.Acttivity.RecommendDomain;
import com.example.redditapp.R;

import java.util.ArrayList;

public class RecommendAdapter extends RecyclerView.Adapter<RecommendAdapter.Viewholder>{
    ArrayList<RecommendDomain> recommendDomains;

    public RecommendAdapter(ArrayList<RecommendDomain> recommendDomains) {
        this.recommendDomains = recommendDomains;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_info,parent,false);
        return new Viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.tiltle.setText(recommendDomains.get(position).getTiltle());

        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(recommendDomains.get(position).getPic(),"drawable",holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.pic);
    }

    @Override
    public int getItemCount() {
        return recommendDomains.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder       {
        TextView    tiltle,voteno;
        ImageView  upvote,downvote,pic;
        public Viewholder(@NonNull View itemView)   {
            super(itemView);
            tiltle=itemView.findViewById(R.id.tiltle);
            pic=itemView.findViewById(R.id.pic);
            upvote=itemView.findViewById(R.id.upvote);
            downvote=itemView.findViewById(R.id.downvote);
        }

    }
}
