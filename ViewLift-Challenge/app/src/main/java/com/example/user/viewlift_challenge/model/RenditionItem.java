package com.example.user.viewlift_challenge.model;


import com.google.gson.annotations.SerializedName;

public class RenditionItem{

	@SerializedName("bitrate")
	private Object bitrate;

	@SerializedName("resolution")
	private Object resolution;

	@SerializedName("url")
	private String url;

	@SerializedName("key")
	private Object key;

	public void setBitrate(Object bitrate){
		this.bitrate = bitrate;
	}

	public Object getBitrate(){
		return bitrate;
	}

	public void setResolution(Object resolution){
		this.resolution = resolution;
	}

	public Object getResolution(){
		return resolution;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setKey(Object key){
		this.key = key;
	}

	public Object getKey(){
		return key;
	}

	@Override
 	public String toString(){
		return 
			"RenditionItem{" + 
			"bitrate = '" + bitrate + '\'' + 
			",resolution = '" + resolution + '\'' + 
			",url = '" + url + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}