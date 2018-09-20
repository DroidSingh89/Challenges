package com.example.user.symbiovolvochallenge.model.bean;


import com.google.gson.annotations.SerializedName;

public class Location{

	@SerializedName("latt_long")
	private String lattLong;

	@SerializedName("woeid")
	private int woeid;

	@SerializedName("title")
	private String title;

	@SerializedName("location_type")
	private String locationType;

	public void setLattLong(String lattLong){
		this.lattLong = lattLong;
	}

	public String getLattLong(){
		return lattLong;
	}

	public void setWoeid(int woeid){
		this.woeid = woeid;
	}

	public int getWoeid(){
		return woeid;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setLocationType(String locationType){
		this.locationType = locationType;
	}

	public String getLocationType(){
		return locationType;
	}

	@Override
 	public String toString(){
		return 
			"Location{" + 
			"latt_long = '" + lattLong + '\'' + 
			",woeid = '" + woeid + '\'' + 
			",title = '" + title + '\'' + 
			",location_type = '" + locationType + '\'' + 
			"}";
		}
}