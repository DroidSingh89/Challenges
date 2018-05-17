package com.example.user.uberflickerchallenge.view.imagelist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.user.uberflickerchallenge.R;
import com.example.user.uberflickerchallenge.model.Photo;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by user on 10/11/17.
 */

public class ImageListAdapter extends RecyclerView.Adapter<ImageListAdapter.ViewHolder> {

    List<Photo> photoList = new ArrayList<>();
    Context context;

    public ImageListAdapter(List<Photo> photoList) {
        this.photoList = photoList;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivPhoto;

        public ViewHolder(View itemView) {
            super(itemView);

            ivPhoto = itemView.findViewById(R.id.ivPhoto);
        }
    }

    @Override
    public ImageListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_list_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ImageListAdapter.ViewHolder holder, int position) {


        Photo photo = photoList.get(position);
//        "http://farm{farm}.static.flickr.com/{server}/{id}_{secret}.jpg"

        Log.d(TAG, "onBindViewHolder: " +photo.getId());
        String imageUrl = getImageUrl(photo);
        Glide.with(context).load(imageUrl).into(holder.ivPhoto);


    }

    @NonNull
    private String getImageUrl(Photo photo) {

        String image = "http://farm" + photo.getFarm()
                + ".static.flickr.com/" + photo.getServer()
                + "/" + photo.getId() + "_"
                + photo.getSecret() + ".jpg";
        Log.d(TAG, "getImageUrl: " + image);
        return image;
    }

    @Override
    public int getItemCount() {
        return photoList.size();
    }
}
