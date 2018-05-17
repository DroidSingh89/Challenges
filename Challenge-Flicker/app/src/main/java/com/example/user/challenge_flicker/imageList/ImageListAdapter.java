package com.example.user.challenge_flicker.imageList;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.user.challenge_flicker.R;
import com.example.user.challenge_flicker.model.Item;

import java.util.List;

/**
 * Created by user on 3/16/18.
 */

public class ImageListAdapter extends RecyclerView.Adapter<ImageListAdapter.ViewHolder>{

    Context context;
    List<Item> itemList;

    public ImageListAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }


    @Override
    public ImageListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ImageListAdapter.ViewHolder holder, int position) {

        Item item = itemList.get(position);
        Glide.with(context).load(item.getMedia().getM()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ivMain);

        }
    }
}
