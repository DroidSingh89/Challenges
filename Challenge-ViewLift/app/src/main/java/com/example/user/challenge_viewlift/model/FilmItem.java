package com.example.user.challenge_viewlift.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class FilmItem{

	@SerializedName("isSmoothAsset")
	private Object isSmoothAsset;

	@SerializedName("syndicationPartner")
	private Object syndicationPartner;

	@SerializedName("addedDate")
	private Object addedDate;

	@SerializedName("notes")
	private List<Object> notes;

	@SerializedName("player_tags")
	private Object playerTags;

	@SerializedName("isLiveStream")
	private boolean isLiveStream;

	@SerializedName("your_grade")
	private Object yourGrade;

	@SerializedName("year")
	private Object year;

	@SerializedName("imdbId")
	private Object imdbId;

	@SerializedName("rating")
	private Object rating;

	@SerializedName("bumperUrl")
	private Object bumperUrl;

	@SerializedName("huluId")
	private Object huluId;

	@SerializedName("episode")
	private int episode;

	@SerializedName("yTVideoId")
	private Object yTVideoId;

	@SerializedName("type")
	private Object type;

	@SerializedName("mp4_url")
	private Object mp4Url;

	@SerializedName("playable")
	private Object playable;

	@SerializedName("isFree")
	private boolean isFree;

	@SerializedName("primaryCategory")
	private Object primaryCategory;

	@SerializedName("percentage")
	private int percentage;

	@SerializedName("scheduling")
	private Object scheduling;

	@SerializedName("starRatingCount")
	private Object starRatingCount;

	@SerializedName("season")
	private Object season;

	@SerializedName("id")
	private String id;

	@SerializedName("embed")
	private Object embed;

	@SerializedName("closed_captions")
	private Object closedCaptions;

	@SerializedName("isQueued")
	private Object isQueued;

	@SerializedName("ccFileUrl")
	private Object ccFileUrl;

	@SerializedName("publishTime")
	private Object publishTime;

	@SerializedName("images")
	private Images images;

	@SerializedName("seasons")
	private Object seasons;

	@SerializedName("show_id")
	private Object showId;

	@SerializedName("author")
	private Object author;

	@SerializedName("film_type")
	private Object filmType;

	@SerializedName("runtime")
	private int runtime;

	@SerializedName("kisweEventId")
	private Object kisweEventId;

	@SerializedName("tags")
	private String tags;

	@SerializedName("external_link")
	private Object externalLink;

	@SerializedName("durationMinutes")
	private int durationMinutes;

	@SerializedName("ads")
	private Object ads;

	@SerializedName("start_time")
	private int startTime;

	@SerializedName("channels")
	private Object channels;

	@SerializedName("show_title")
	private Object showTitle;

	@SerializedName("professors")
	private Object professors;

	@SerializedName("viewer_grade")
	private Object viewerGrade;

	@SerializedName("clip_url")
	private Object clipUrl;

	@SerializedName("permalink")
	private Object permalink;

	@SerializedName("fBVideoId")
	private Object fBVideoId;

	@SerializedName("status")
	private Object status;

	@SerializedName("permaLink")
	private String permaLink;

	@SerializedName("durationSeconds")
	private int durationSeconds;

	@SerializedName("mast")
	private Object mast;

	@SerializedName("description")
	private Object description;

	@SerializedName("relatedFilms")
	private RelatedFilms relatedFilms;

	@SerializedName("social_widgets")
	private Object socialWidgets;

	@SerializedName("hls_url")
	private Object hlsUrl;

	@SerializedName("title")
	private String title;

	@SerializedName("episodeNumber")
	private int episodeNumber;

	@SerializedName("parentalRating")
	private String parentalRating;

	@SerializedName("shares")
	private int shares;

	@SerializedName("logline")
	private Object logline;

	@SerializedName("content_type")
	private Object contentType;

	@SerializedName("secondaryCategories")
	private Object secondaryCategories;

	@SerializedName("credits")
	private Object credits;

	@SerializedName("audioRenditions")
	private Object audioRenditions;

	@SerializedName("featured_tag")
	private Object featuredTag;

	@SerializedName("renditions")
	private Renditions renditions;

	@SerializedName("free")
	private boolean free;

	@SerializedName("dfp_tag")
	private Object dfpTag;

	@SerializedName("views")
	private int views;

	@SerializedName("isCompleted")
	private Object isCompleted;

	@SerializedName("ageRestricted")
	private boolean ageRestricted;

	@SerializedName("no_of_episodes")
	private int noOfEpisodes;

	@SerializedName("comments")
	private int comments;

	@SerializedName("manifest")
	private Object manifest;

	@SerializedName("errorMessage")
	private Object errorMessage;

	@SerializedName("end_time")
	private int endTime;

	@SerializedName("geoRestrictions")
	private String geoRestrictions;

	@SerializedName("seasonNumber")
	private int seasonNumber;

	@SerializedName("creditBlocks")
	private Object creditBlocks;

	@SerializedName("disable_live_player")
	private boolean disableLivePlayer;

	@SerializedName("trailer_url")
	private Object trailerUrl;

	@SerializedName("related_courses")
	private Object relatedCourses;

	@SerializedName("fbCommentsUrl")
	private String fbCommentsUrl;

	@SerializedName("starRatingAvg")
	private Object starRatingAvg;

	@SerializedName("hds")
	private boolean hds;

	@SerializedName("no_of_seasons")
	private int noOfSeasons;

	@SerializedName("time")
	private int time;

	@SerializedName("hd")
	private boolean hd;

	public void setIsSmoothAsset(Object isSmoothAsset){
		this.isSmoothAsset = isSmoothAsset;
	}

	public Object getIsSmoothAsset(){
		return isSmoothAsset;
	}

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

	public void setNotes(List<Object> notes){
		this.notes = notes;
	}

	public List<Object> getNotes(){
		return notes;
	}

	public void setPlayerTags(Object playerTags){
		this.playerTags = playerTags;
	}

	public Object getPlayerTags(){
		return playerTags;
	}

	public void setIsLiveStream(boolean isLiveStream){
		this.isLiveStream = isLiveStream;
	}

	public boolean isIsLiveStream(){
		return isLiveStream;
	}

	public void setYourGrade(Object yourGrade){
		this.yourGrade = yourGrade;
	}

	public Object getYourGrade(){
		return yourGrade;
	}

	public void setYear(Object year){
		this.year = year;
	}

	public Object getYear(){
		return year;
	}

	public void setImdbId(Object imdbId){
		this.imdbId = imdbId;
	}

	public Object getImdbId(){
		return imdbId;
	}

	public void setRating(Object rating){
		this.rating = rating;
	}

	public Object getRating(){
		return rating;
	}

	public void setBumperUrl(Object bumperUrl){
		this.bumperUrl = bumperUrl;
	}

	public Object getBumperUrl(){
		return bumperUrl;
	}

	public void setHuluId(Object huluId){
		this.huluId = huluId;
	}

	public Object getHuluId(){
		return huluId;
	}

	public void setEpisode(int episode){
		this.episode = episode;
	}

	public int getEpisode(){
		return episode;
	}

	public void setYTVideoId(Object yTVideoId){
		this.yTVideoId = yTVideoId;
	}

	public Object getYTVideoId(){
		return yTVideoId;
	}

	public void setType(Object type){
		this.type = type;
	}

	public Object getType(){
		return type;
	}

	public void setMp4Url(Object mp4Url){
		this.mp4Url = mp4Url;
	}

	public Object getMp4Url(){
		return mp4Url;
	}

	public void setPlayable(Object playable){
		this.playable = playable;
	}

	public Object getPlayable(){
		return playable;
	}

	public void setIsFree(boolean isFree){
		this.isFree = isFree;
	}

	public boolean isIsFree(){
		return isFree;
	}

	public void setPrimaryCategory(Object primaryCategory){
		this.primaryCategory = primaryCategory;
	}

	public Object getPrimaryCategory(){
		return primaryCategory;
	}

	public void setPercentage(int percentage){
		this.percentage = percentage;
	}

	public int getPercentage(){
		return percentage;
	}

	public void setScheduling(Object scheduling){
		this.scheduling = scheduling;
	}

	public Object getScheduling(){
		return scheduling;
	}

	public void setStarRatingCount(Object starRatingCount){
		this.starRatingCount = starRatingCount;
	}

	public Object getStarRatingCount(){
		return starRatingCount;
	}

	public void setSeason(Object season){
		this.season = season;
	}

	public Object getSeason(){
		return season;
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

	public void setClosedCaptions(Object closedCaptions){
		this.closedCaptions = closedCaptions;
	}

	public Object getClosedCaptions(){
		return closedCaptions;
	}

	public void setIsQueued(Object isQueued){
		this.isQueued = isQueued;
	}

	public Object getIsQueued(){
		return isQueued;
	}

	public void setCcFileUrl(Object ccFileUrl){
		this.ccFileUrl = ccFileUrl;
	}

	public Object getCcFileUrl(){
		return ccFileUrl;
	}

	public void setPublishTime(Object publishTime){
		this.publishTime = publishTime;
	}

	public Object getPublishTime(){
		return publishTime;
	}

	public void setImages(Images images){
		this.images = images;
	}

	public Images getImages(){
		return images;
	}

	public void setSeasons(Object seasons){
		this.seasons = seasons;
	}

	public Object getSeasons(){
		return seasons;
	}

	public void setShowId(Object showId){
		this.showId = showId;
	}

	public Object getShowId(){
		return showId;
	}

	public void setAuthor(Object author){
		this.author = author;
	}

	public Object getAuthor(){
		return author;
	}

	public void setFilmType(Object filmType){
		this.filmType = filmType;
	}

	public Object getFilmType(){
		return filmType;
	}

	public void setRuntime(int runtime){
		this.runtime = runtime;
	}

	public int getRuntime(){
		return runtime;
	}

	public void setKisweEventId(Object kisweEventId){
		this.kisweEventId = kisweEventId;
	}

	public Object getKisweEventId(){
		return kisweEventId;
	}

	public void setTags(String tags){
		this.tags = tags;
	}

	public String getTags(){
		return tags;
	}

	public void setExternalLink(Object externalLink){
		this.externalLink = externalLink;
	}

	public Object getExternalLink(){
		return externalLink;
	}

	public void setDurationMinutes(int durationMinutes){
		this.durationMinutes = durationMinutes;
	}

	public int getDurationMinutes(){
		return durationMinutes;
	}

	public void setAds(Object ads){
		this.ads = ads;
	}

	public Object getAds(){
		return ads;
	}

	public void setStartTime(int startTime){
		this.startTime = startTime;
	}

	public int getStartTime(){
		return startTime;
	}

	public void setChannels(Object channels){
		this.channels = channels;
	}

	public Object getChannels(){
		return channels;
	}

	public void setShowTitle(Object showTitle){
		this.showTitle = showTitle;
	}

	public Object getShowTitle(){
		return showTitle;
	}

	public void setProfessors(Object professors){
		this.professors = professors;
	}

	public Object getProfessors(){
		return professors;
	}

	public void setViewerGrade(Object viewerGrade){
		this.viewerGrade = viewerGrade;
	}

	public Object getViewerGrade(){
		return viewerGrade;
	}

	public void setClipUrl(Object clipUrl){
		this.clipUrl = clipUrl;
	}

	public Object getClipUrl(){
		return clipUrl;
	}

	public void setPermalink(Object permalink){
		this.permalink = permalink;
	}

	public Object getPermalink(){
		return permalink;
	}

	public void setFBVideoId(Object fBVideoId){
		this.fBVideoId = fBVideoId;
	}

	public Object getFBVideoId(){
		return fBVideoId;
	}

	public void setStatus(Object status){
		this.status = status;
	}

	public Object getStatus(){
		return status;
	}

	public void setPermaLink(String permaLink){
		this.permaLink = permaLink;
	}

	public String getPermaLink(){
		return permaLink;
	}

	public void setDurationSeconds(int durationSeconds){
		this.durationSeconds = durationSeconds;
	}

	public int getDurationSeconds(){
		return durationSeconds;
	}

	public void setMast(Object mast){
		this.mast = mast;
	}

	public Object getMast(){
		return mast;
	}

	public void setDescription(Object description){
		this.description = description;
	}

	public Object getDescription(){
		return description;
	}

	public void setRelatedFilms(RelatedFilms relatedFilms){
		this.relatedFilms = relatedFilms;
	}

	public RelatedFilms getRelatedFilms(){
		return relatedFilms;
	}

	public void setSocialWidgets(Object socialWidgets){
		this.socialWidgets = socialWidgets;
	}

	public Object getSocialWidgets(){
		return socialWidgets;
	}

	public void setHlsUrl(Object hlsUrl){
		this.hlsUrl = hlsUrl;
	}

	public Object getHlsUrl(){
		return hlsUrl;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setEpisodeNumber(int episodeNumber){
		this.episodeNumber = episodeNumber;
	}

	public int getEpisodeNumber(){
		return episodeNumber;
	}

	public void setParentalRating(String parentalRating){
		this.parentalRating = parentalRating;
	}

	public String getParentalRating(){
		return parentalRating;
	}

	public void setShares(int shares){
		this.shares = shares;
	}

	public int getShares(){
		return shares;
	}

	public void setLogline(Object logline){
		this.logline = logline;
	}

	public Object getLogline(){
		return logline;
	}

	public void setContentType(Object contentType){
		this.contentType = contentType;
	}

	public Object getContentType(){
		return contentType;
	}

	public void setSecondaryCategories(Object secondaryCategories){
		this.secondaryCategories = secondaryCategories;
	}

	public Object getSecondaryCategories(){
		return secondaryCategories;
	}

	public void setCredits(Object credits){
		this.credits = credits;
	}

	public Object getCredits(){
		return credits;
	}

	public void setAudioRenditions(Object audioRenditions){
		this.audioRenditions = audioRenditions;
	}

	public Object getAudioRenditions(){
		return audioRenditions;
	}

	public void setFeaturedTag(Object featuredTag){
		this.featuredTag = featuredTag;
	}

	public Object getFeaturedTag(){
		return featuredTag;
	}

	public void setRenditions(Renditions renditions){
		this.renditions = renditions;
	}

	public Renditions getRenditions(){
		return renditions;
	}

	public void setFree(boolean free){
		this.free = free;
	}

	public boolean isFree(){
		return free;
	}

	public void setDfpTag(Object dfpTag){
		this.dfpTag = dfpTag;
	}

	public Object getDfpTag(){
		return dfpTag;
	}

	public void setViews(int views){
		this.views = views;
	}

	public int getViews(){
		return views;
	}

	public void setIsCompleted(Object isCompleted){
		this.isCompleted = isCompleted;
	}

	public Object getIsCompleted(){
		return isCompleted;
	}

	public void setAgeRestricted(boolean ageRestricted){
		this.ageRestricted = ageRestricted;
	}

	public boolean isAgeRestricted(){
		return ageRestricted;
	}

	public void setNoOfEpisodes(int noOfEpisodes){
		this.noOfEpisodes = noOfEpisodes;
	}

	public int getNoOfEpisodes(){
		return noOfEpisodes;
	}

	public void setComments(int comments){
		this.comments = comments;
	}

	public int getComments(){
		return comments;
	}

	public void setManifest(Object manifest){
		this.manifest = manifest;
	}

	public Object getManifest(){
		return manifest;
	}

	public void setErrorMessage(Object errorMessage){
		this.errorMessage = errorMessage;
	}

	public Object getErrorMessage(){
		return errorMessage;
	}

	public void setEndTime(int endTime){
		this.endTime = endTime;
	}

	public int getEndTime(){
		return endTime;
	}

	public void setGeoRestrictions(String geoRestrictions){
		this.geoRestrictions = geoRestrictions;
	}

	public String getGeoRestrictions(){
		return geoRestrictions;
	}

	public void setSeasonNumber(int seasonNumber){
		this.seasonNumber = seasonNumber;
	}

	public int getSeasonNumber(){
		return seasonNumber;
	}

	public void setCreditBlocks(Object creditBlocks){
		this.creditBlocks = creditBlocks;
	}

	public Object getCreditBlocks(){
		return creditBlocks;
	}

	public void setDisableLivePlayer(boolean disableLivePlayer){
		this.disableLivePlayer = disableLivePlayer;
	}

	public boolean isDisableLivePlayer(){
		return disableLivePlayer;
	}

	public void setTrailerUrl(Object trailerUrl){
		this.trailerUrl = trailerUrl;
	}

	public Object getTrailerUrl(){
		return trailerUrl;
	}

	public void setRelatedCourses(Object relatedCourses){
		this.relatedCourses = relatedCourses;
	}

	public Object getRelatedCourses(){
		return relatedCourses;
	}

	public void setFbCommentsUrl(String fbCommentsUrl){
		this.fbCommentsUrl = fbCommentsUrl;
	}

	public String getFbCommentsUrl(){
		return fbCommentsUrl;
	}

	public void setStarRatingAvg(Object starRatingAvg){
		this.starRatingAvg = starRatingAvg;
	}

	public Object getStarRatingAvg(){
		return starRatingAvg;
	}

	public void setHds(boolean hds){
		this.hds = hds;
	}

	public boolean isHds(){
		return hds;
	}

	public void setNoOfSeasons(int noOfSeasons){
		this.noOfSeasons = noOfSeasons;
	}

	public int getNoOfSeasons(){
		return noOfSeasons;
	}

	public void setTime(int time){
		this.time = time;
	}

	public int getTime(){
		return time;
	}

	public void setHd(boolean hd){
		this.hd = hd;
	}

	public boolean isHd(){
		return hd;
	}

	@Override
 	public String toString(){
		return 
			"FilmItem{" + 
			"isSmoothAsset = '" + isSmoothAsset + '\'' + 
			",syndicationPartner = '" + syndicationPartner + '\'' + 
			",addedDate = '" + addedDate + '\'' + 
			",notes = '" + notes + '\'' + 
			",player_tags = '" + playerTags + '\'' + 
			",isLiveStream = '" + isLiveStream + '\'' + 
			",your_grade = '" + yourGrade + '\'' + 
			",year = '" + year + '\'' + 
			",imdbId = '" + imdbId + '\'' + 
			",rating = '" + rating + '\'' + 
			",bumperUrl = '" + bumperUrl + '\'' + 
			",huluId = '" + huluId + '\'' + 
			",episode = '" + episode + '\'' + 
			",yTVideoId = '" + yTVideoId + '\'' + 
			",type = '" + type + '\'' + 
			",mp4_url = '" + mp4Url + '\'' + 
			",playable = '" + playable + '\'' + 
			",isFree = '" + isFree + '\'' + 
			",primaryCategory = '" + primaryCategory + '\'' + 
			",percentage = '" + percentage + '\'' + 
			",scheduling = '" + scheduling + '\'' + 
			",starRatingCount = '" + starRatingCount + '\'' + 
			",season = '" + season + '\'' + 
			",id = '" + id + '\'' + 
			",embed = '" + embed + '\'' + 
			",closed_captions = '" + closedCaptions + '\'' + 
			",isQueued = '" + isQueued + '\'' + 
			",ccFileUrl = '" + ccFileUrl + '\'' + 
			",publishTime = '" + publishTime + '\'' + 
			",images = '" + images + '\'' + 
			",seasons = '" + seasons + '\'' + 
			",show_id = '" + showId + '\'' + 
			",author = '" + author + '\'' + 
			",film_type = '" + filmType + '\'' + 
			",runtime = '" + runtime + '\'' + 
			",kisweEventId = '" + kisweEventId + '\'' + 
			",tags = '" + tags + '\'' + 
			",external_link = '" + externalLink + '\'' + 
			",durationMinutes = '" + durationMinutes + '\'' + 
			",ads = '" + ads + '\'' + 
			",start_time = '" + startTime + '\'' + 
			",channels = '" + channels + '\'' + 
			",show_title = '" + showTitle + '\'' + 
			",professors = '" + professors + '\'' + 
			",viewer_grade = '" + viewerGrade + '\'' + 
			",clip_url = '" + clipUrl + '\'' + 
			",permalink = '" + permalink + '\'' + 
			",fBVideoId = '" + fBVideoId + '\'' + 
			",status = '" + status + '\'' + 
			",permaLink = '" + permaLink + '\'' + 
			",durationSeconds = '" + durationSeconds + '\'' + 
			",mast = '" + mast + '\'' + 
			",description = '" + description + '\'' + 
			",relatedFilms = '" + relatedFilms + '\'' + 
			",social_widgets = '" + socialWidgets + '\'' + 
			",hls_url = '" + hlsUrl + '\'' + 
			",title = '" + title + '\'' + 
			",episodeNumber = '" + episodeNumber + '\'' + 
			",parentalRating = '" + parentalRating + '\'' + 
			",shares = '" + shares + '\'' + 
			",logline = '" + logline + '\'' + 
			",content_type = '" + contentType + '\'' + 
			",secondaryCategories = '" + secondaryCategories + '\'' + 
			",credits = '" + credits + '\'' + 
			",audioRenditions = '" + audioRenditions + '\'' + 
			",featured_tag = '" + featuredTag + '\'' + 
			",renditions = '" + renditions + '\'' + 
			",free = '" + free + '\'' + 
			",dfp_tag = '" + dfpTag + '\'' + 
			",views = '" + views + '\'' + 
			",isCompleted = '" + isCompleted + '\'' + 
			",ageRestricted = '" + ageRestricted + '\'' + 
			",no_of_episodes = '" + noOfEpisodes + '\'' + 
			",comments = '" + comments + '\'' + 
			",manifest = '" + manifest + '\'' + 
			",errorMessage = '" + errorMessage + '\'' + 
			",end_time = '" + endTime + '\'' + 
			",geoRestrictions = '" + geoRestrictions + '\'' + 
			",seasonNumber = '" + seasonNumber + '\'' + 
			",creditBlocks = '" + creditBlocks + '\'' + 
			",disable_live_player = '" + disableLivePlayer + '\'' + 
			",trailer_url = '" + trailerUrl + '\'' + 
			",related_courses = '" + relatedCourses + '\'' + 
			",fbCommentsUrl = '" + fbCommentsUrl + '\'' + 
			",starRatingAvg = '" + starRatingAvg + '\'' + 
			",hds = '" + hds + '\'' + 
			",no_of_seasons = '" + noOfSeasons + '\'' + 
			",time = '" + time + '\'' + 
			",hd = '" + hd + '\'' + 
			"}";
		}
}