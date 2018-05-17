package com.example.user.viewlift_challenge.model;

import com.google.gson.annotations.SerializedName;

public class RelatedFilmItem{

	@SerializedName("syndicationPartner")
	private Object syndicationPartner;

	@SerializedName("addedDate")
	private Object addedDate;

	@SerializedName("durationInSeconds")
	private Object durationInSeconds;

	@SerializedName("durationSeconds")
	private Object durationSeconds;

	@SerializedName("year")
	private Object year;

	@SerializedName("publishDate")
	private Object publishDate;

	@SerializedName("description")
	private Object description;

	@SerializedName("huluId")
	private Object huluId;

	@SerializedName("title")
	private String title;

	@SerializedName("parentalRating")
	private Object parentalRating;

	@SerializedName("isFree")
	private boolean isFree;

	@SerializedName("content_type")
	private Object contentType;

	@SerializedName("percentage")
	private int percentage;

	@SerializedName("startTime")
	private Object startTime;

	@SerializedName("renditions")
	private Object renditions;

	@SerializedName("id")
	private String id;

	@SerializedName("embed")
	private Object embed;

	@SerializedName("free")
	private boolean free;

	@SerializedName("isQueued")
	private Object isQueued;

	@SerializedName("hlsUrl")
	private Object hlsUrl;

	@SerializedName("images")
	private Images images;

	@SerializedName("duarionInMinutes")
	private Object duarionInMinutes;

	@SerializedName("runtime")
	private int runtime;

	@SerializedName("durationMinutes")
	private Object durationMinutes;

	@SerializedName("ads")
	private Object ads;

	@SerializedName("showTitle")
	private Object showTitle;

	@SerializedName("viewer_grade")
	private Object viewerGrade;

	@SerializedName("endTime")
	private Object endTime;

	@SerializedName("time")
	private int time;

	@SerializedName("permalink")
	private Object permalink;

	public void setSyndicationPartner(Object syndicationPartner){
		this.syndicationPartner = syndicationPartner;
	}

	public Object getSyndicationPartner(){
		return syndicationPartner;
	}

	public void setAddedDate(Object addedDate){
		this.addedDate = addedDate;
	}

	public Object getAddedDate(){
		return addedDate;
	}

	public void setDurationInSeconds(Object durationInSeconds){
		this.durationInSeconds = durationInSeconds;
	}

	public Object getDurationInSeconds(){
		return durationInSeconds;
	}

	public void setDurationSeconds(Object durationSeconds){
		this.durationSeconds = durationSeconds;
	}

	public Object getDurationSeconds(){
		return durationSeconds;
	}

	public void setYear(Object year){
		this.year = year;
	}

	public Object getYear(){
		return year;
	}

	public void setPublishDate(Object publishDate){
		this.publishDate = publishDate;
	}

	public Object getPublishDate(){
		return publishDate;
	}

	public void setDescription(Object description){
		this.description = description;
	}

	public Object getDescription(){
		return description;
	}

	public void setHuluId(Object huluId){
		this.huluId = huluId;
	}

	public Object getHuluId(){
		return huluId;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setParentalRating(Object parentalRating){
		this.parentalRating = parentalRating;
	}

	public Object getParentalRating(){
		return parentalRating;
	}

	public void setIsFree(boolean isFree){
		this.isFree = isFree;
	}

	public boolean isIsFree(){
		return isFree;
	}

	public void setContentType(Object contentType){
		this.contentType = contentType;
	}

	public Object getContentType(){
		return contentType;
	}

	public void setPercentage(int percentage){
		this.percentage = percentage;
	}

	public int getPercentage(){
		return percentage;
	}

	public void setStartTime(Object startTime){
		this.startTime = startTime;
	}

	public Object getStartTime(){
		return startTime;
	}

	public void setRenditions(Object renditions){
		this.renditions = renditions;
	}

	public Object getRenditions(){
		return renditions;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setEmbed(Object embed){
		this.embed = embed;
	}

	public Object getEmbed(){
		return embed;
	}

	public void setFree(boolean free){
		this.free = free;
	}

	public boolean isFree(){
		return free;
	}

	public void setIsQueued(Object isQueued){
		this.isQueued = isQueued;
	}

	public Object getIsQueued(){
		return isQueued;
	}

	public void setHlsUrl(Object hlsUrl){
		this.hlsUrl = hlsUrl;
	}

	public Object getHlsUrl(){
		return hlsUrl;
	}

	public void setImages(Images images){
		this.images = images;
	}

	public Images getImages(){
		return images;
	}

	public void setDuarionInMinutes(Object duarionInMinutes){
		this.duarionInMinutes = duarionInMinutes;
	}

	public Object getDuarionInMinutes(){
		return duarionInMinutes;
	}

	public void setRuntime(int runtime){
		this.runtime = runtime;
	}

	public int getRuntime(){
		return runtime;
	}

	public void setDurationMinutes(Object durationMinutes){
		this.durationMinutes = durationMinutes;
	}

	public Object getDurationMinutes(){
		return durationMinutes;
	}

	public void setAds(Object ads){
		this.ads = ads;
	}

	public Object getAds(){
		return ads;
	}

	public void setShowTitle(Object showTitle){
		this.showTitle = showTitle;
	}

	public Object getShowTitle(){
		return showTitle;
	}

	public void setViewerGrade(Object viewerGrade){
		this.viewerGrade = viewerGrade;
	}

	public Object getViewerGrade(){
		return viewerGrade;
	}

	public void setEndTime(Object endTime){
		this.endTime = endTime;
	}

	public Object getEndTime(){
		return endTime;
	}

	public void setTime(int time){
		this.time = time;
	}

	public int getTime(){
		return time;
	}

	public void setPermalink(Object permalink){
		this.permalink = permalink;
	}

	public Object getPermalink(){
		return permalink;
	}

	@Override
 	public String toString(){
		return 
			"RelatedFilmItem{" + 
			"syndicationPartner = '" + syndicationPartner + '\'' + 
			",addedDate = '" + addedDate + '\'' + 
			",durationInSeconds = '" + durationInSeconds + '\'' + 
			",durationSeconds = '" + durationSeconds + '\'' + 
			",year = '" + year + '\'' + 
			",publishDate = '" + publishDate + '\'' + 
			",description = '" + description + '\'' + 
			",huluId = '" + huluId + '\'' + 
			",title = '" + title + '\'' + 
			",parentalRating = '" + parentalRating + '\'' + 
			",isFree = '" + isFree + '\'' + 
			",content_type = '" + contentType + '\'' + 
			",percentage = '" + percentage + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",renditions = '" + renditions + '\'' + 
			",id = '" + id + '\'' + 
			",embed = '" + embed + '\'' + 
			",free = '" + free + '\'' + 
			",isQueued = '" + isQueued + '\'' + 
			",hlsUrl = '" + hlsUrl + '\'' + 
			",images = '" + images + '\'' + 
			",duarionInMinutes = '" + duarionInMinutes + '\'' + 
			",runtime = '" + runtime + '\'' + 
			",durationMinutes = '" + durationMinutes + '\'' + 
			",ads = '" + ads + '\'' + 
			",showTitle = '" + showTitle + '\'' + 
			",viewer_grade = '" + viewerGrade + '\'' + 
			",endTime = '" + endTime + '\'' + 
			",time = '" + time + '\'' + 
			",permalink = '" + permalink + '\'' + 
			"}";
		}
}