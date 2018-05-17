package com.example.user.viewlift_challenge.model;

import com.google.gson.annotations.SerializedName;

public class Snagfilms {

	@SerializedName("films")
	private Films films;


	public void setFilms(Films films){
		this.films = films;
	}

	public Films getFilms(){
		return films;
	}

	@Override
 	public String toString(){
		return 
			"Snagfilms{" +
			"films = '" + films + '\'' + 
			"}";
		}
}