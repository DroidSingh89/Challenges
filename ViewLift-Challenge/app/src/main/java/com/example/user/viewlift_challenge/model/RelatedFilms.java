package com.example.user.viewlift_challenge.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RelatedFilms{

	@SerializedName("relatedFilm")
	private List<RelatedFilmItem> relatedFilm;

	public void setRelatedFilm(List<RelatedFilmItem> relatedFilm){
		this.relatedFilm = relatedFilm;
	}

	public List<RelatedFilmItem> getRelatedFilm(){
		return relatedFilm;
	}

	@Override
 	public String toString(){
		return 
			"RelatedFilms{" + 
			"relatedFilm = '" + relatedFilm + '\'' + 
			"}";
		}
}