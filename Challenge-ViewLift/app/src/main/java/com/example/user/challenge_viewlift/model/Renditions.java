package com.example.user.challenge_viewlift.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

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