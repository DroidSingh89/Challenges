package com.example.user.viewlift_challenge.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Renditions{

	@SerializedName("rendition")
	private List<RenditionItem> rendition;

	public void setRendition(List<RenditionItem> rendition){
		this.rendition = rendition;
	}

	public List<RenditionItem> getRendition(){
		return rendition;
	}

	@Override
 	public String toString(){
		return 
			"Renditions{" + 
			"rendition = '" + rendition + '\'' + 
			"}";
		}
}