package com.example.user.challenge_viewlift.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

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