package com.example.user.symbiovolvochallenge.view.weather;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.user.symbiovolvochallenge.R;
import com.example.user.symbiovolvochallenge.model.bean.Weather;
import com.example.user.symbiovolvochallenge.utils.WeatherUtils;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder>{

    List<Weather> weatherList;

    public WeatherAdapter(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    public void updateWeather(List<Weather> weathers) {
        this.weatherList.clear();
        this.weatherList.addAll(weathers);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview_weather, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Log.d("MYTAG", "onBindViewHolder: ");

        Weather weather = weatherList.get(position);
        holder.tvCity.setText(weather.getLocation());
        Glide.with(holder.itemView.getContext()).load(WeatherUtils.INSTANCE.formatIcon(weather)).into(holder.ivWeather);

    }

    @Override
    public int getItemCount() {
        return weatherList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCity;
        private ImageView ivWeather;
        ViewHolder(View itemView) {
            super(itemView);
            tvCity = itemView.findViewById(R.id.tvCity);
            ivWeather = itemView.findViewById(R.id.ivWeather);
        }
    }
}
