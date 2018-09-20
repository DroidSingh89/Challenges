package com.example.user.symbiovolvochallenge.model.bean.consolidatedweather;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ConsolidatedWeather{

	@SerializedName("sun_set")
	private String sunSet;

	@SerializedName("parent")
	private Parent parent;

	@SerializedName("sources")
	private List<SourcesItem> sources;

	@SerializedName("latt_long")
	private String lattLong;

	@SerializedName("timezone")
	private String timezone;

	@SerializedName("timezone_name")
	private String timezoneName;

	@SerializedName("woeid")
	private int woeid;

	@SerializedName("sun_rise")
	private String sunRise;

	@SerializedName("consolidated_weather")
	private List<ConsolidatedWeatherItem> consolidatedWeather;

	@SerializedName("time")
	private String time;

	@SerializedName("title")
	private String title;

	@SerializedName("location_type")
	private String locationType;

	public void setSunSet(String sunSet){
		this.sunSet = sunSet;
	}

	public String getSunSet(){
		return sunSet;
	}

	public void setParent(Parent parent){
		this.parent = parent;
	}

	public Parent getParent(){
		return parent;
	}

	public void setSources(List<SourcesItem> sources){
		this.sources = sources;
	}

	public List<SourcesItem> getSources(){
		return sources;
	}

	public void setLattLong(String lattLong){
		this.lattLong = lattLong;
	}

	public String getLattLong(){
		return lattLong;
	}

	public void setTimezone(String timezone){
		this.timezone = timezone;
	}

	public String getTimezone(){
		return timezone;
	}

	public void setTimezoneName(String timezoneName){
		this.timezoneName = timezoneName;
	}

	public String getTimezoneName(){
		return timezoneName;
	}

	public void setWoeid(int woeid){
		this.woeid = woeid;
	}

	public int getWoeid(){
		return woeid;
	}

	public void setSunRise(String sunRise){
		this.sunRise = sunRise;
	}

	public String getSunRise(){
		return sunRise;
	}

	public void setConsolidatedWeather(List<ConsolidatedWeatherItem> consolidatedWeather){
		this.consolidatedWeather = consolidatedWeather;
	}

	public List<ConsolidatedWeatherItem> getConsolidatedWeather(){
		return consolidatedWeather;
	}

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return time;
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
			"ConsolidatedWeather{" + 
			"sun_set = '" + sunSet + '\'' + 
			",parent = '" + parent + '\'' + 
			",sources = '" + sources + '\'' + 
			",latt_long = '" + lattLong + '\'' + 
			",timezone = '" + timezone + '\'' + 
			",timezone_name = '" + timezoneName + '\'' + 
			",woeid = '" + woeid + '\'' + 
			",sun_rise = '" + sunRise + '\'' + 
			",consolidated_weather = '" + consolidatedWeather + '\'' + 
			",time = '" + time + '\'' + 
			",title = '" + title + '\'' + 
			",location_type = '" + locationType + '\'' + 
			"}";
		}
}