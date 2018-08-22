package com.example.user.charlesschwabchallenge.model.data.local;

import android.arch.persistence.room.RoomDatabase;

import com.example.user.charlesschwabchallenge.model.pizza.Pizza;

public abstract class PizzaDatabase extends RoomDatabase{

    abstract PizzaDao pizzaDao();
}
