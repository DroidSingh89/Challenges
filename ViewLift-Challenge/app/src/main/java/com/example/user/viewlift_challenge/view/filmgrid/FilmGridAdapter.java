package com.example.user.viewlift_challenge.view.filmgrid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.user.viewlift_challenge.R;
import com.example.user.viewlift_challenge.model.FilmItem;

import java.util.List;

/**
 * Created by user on 2/14/18.
 */

public class FilmGridAdapter extends RecyclerView.Adapter<FilmGridAdapter.GridViewHolder> {


    List<FilmItem> filmItems;
    Context context;

    public FilmGridAdapter(List<FilmItem> filmItems, Context context) {
        this.filmItems = filmItems;
        this.context = context;
    }

    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item_view, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GridViewHolder holder, int position) {

        FilmItem filmItem = filmItems.get(position);
        holder.tvMain.setText(filmItem.getTitle());
        Glide.with(context)
                .load(filmItem.getImages().getImage().get(0).getSrc())
                .into(holder.ivMain);

    }

    @Override
    public int getItemCount() {
        return filmItems.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {

        ImageView ivMain;
        TextView tvMain;
        public GridViewHolder(View itemView) {
            super(itemView);
            ivMain = itemView.findViewById(R.id.ivMain);
            tvMain = itemView.findViewById(R.id.tvMain);
        }
    }
}
