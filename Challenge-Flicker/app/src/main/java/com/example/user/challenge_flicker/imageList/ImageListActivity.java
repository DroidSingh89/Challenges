package com.example.user.challenge_flicker.imageList;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.user.challenge_flicker.R;
import com.example.user.challenge_flicker.model.FlickerResponse;
import com.example.user.challenge_flicker.model.Item;
import com.example.user.challenge_flicker.network.NetworkManager;
import com.example.user.challenge_flicker.utils.Constants;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ImageListActivity extends AppCompatActivity implements Callback<FlickerResponse> {

    private RecyclerView imageListView;
    private RecyclerView.LayoutManager layoutManager;
    private List<Item> items;
    private ImageListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_list);

        NetworkManager networkManager = new NetworkManager(Constants.Network.URL);
        networkManager.getResponse("kitten")
                .enqueue(this);

        imageListView = findViewById(R.id.rvImage);
        layoutManager = new LinearLayoutManager(this);
        imageListView.setLayoutManager(layoutManager);
        items = new ArrayList<>();
        adapter = new ImageListAdapter(this, items);
        imageListView.setAdapter(adapter);

    }


    @Override
    public void onResponse(Call<FlickerResponse> call, Response<FlickerResponse> response) {
        System.out.println(response.body().getItems().size());
        items.addAll(response.body().getItems());
        adapter.notifyDataSetChanged();

    }

    @Override
    public void onFailure(Call<FlickerResponse> call, Throwable t) {

    }
}
