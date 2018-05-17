package com.example.user.challenge_viewlift.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.user.challenge_viewlift.R;
import com.example.user.challenge_viewlift.model.FilmItem;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by user on 2/5/18.
 */

public class FilmListAdapter extends RecyclerView.Adapter<FilmListAdapter.ViewHolder> {


    List<FilmItem> filmItems;
    Context context;

    public FilmListAdapter(List<FilmItem> filmItems, Context context) {
        this.filmItems = filmItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.film_list_item, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("CheckResult")
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        FilmItem filmItem = filmItems.get(position);
        Glide.with(context)
                .load(filmItem.getImages().getImage().get(0).getSrc())
                .into(holder.ivFilm);

    }

    @Override
    public int getItemCount() {
        return filmItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFilm;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFilm = itemView.findViewById(R.id.ivFilm);
        }
    }
}
