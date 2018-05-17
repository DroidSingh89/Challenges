package com.example.user.challenge_viewlift.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class Films{

	@SerializedName("pageTotal")
	private int pageTotal;

	@SerializedName("dynamicLead")
	private Object dynamicLead;

	@SerializedName("film")
	private List<FilmItem> film;

	@SerializedName("nextOffset")
	private int nextOffset;

	@SerializedName("title")
	private Object title;

	@SerializedName("search_string")
	private Object searchString;

	@SerializedName("previosOffset")
	private Object previosOffset;

	@SerializedName("version")
	private Object version;

	@SerializedName("total")
	private int total;

	@SerializedName("pageIndex")
	private int pageIndex;

	@SerializedName("versions")
	private Object versions;

	@SerializedName("categories")
	private Object categories;

	@SerializedName("id")
	private Object id;

	public void setPageTotal(int pageTotal){
		this.pageTotal = pageTotal;
	}

	public int getPageTotal(){
		return pageTotal;
	}

	public void setDynamicLead(Object dynamicLead){
		this.dynamicLead = dynamicLead;
	}

	public Object getDynamicLead(){
		return dynamicLead;
	}

	public void setFilm(List<FilmItem> film){
		this.film = film;
	}

	public List<FilmItem> getFilm(){
		return film;
	}

	public void setNextOffset(int nextOffset){
		this.nextOffset = nextOffset;
	}

	public int getNextOffset(){
		return nextOffset;
	}

	public void setTitle(Object title){
		this.title = title;
	}

	public Object getTitle(){
		return title;
	}

	public void setSearchString(Object searchString){
		this.searchString = searchString;
	}

	public Object getSearchString(){
		return searchString;
	}

	public void setPreviosOffset(Object previosOffset){
		this.previosOffset = previosOffset;
	}

	public Object getPreviosOffset(){
		return previosOffset;
	}

	public void setVersion(Object version){
		this.version = version;
	}

	public Object getVersion(){
		return version;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setPageIndex(int pageIndex){
		this.pageIndex = pageIndex;
	}

	public int getPageIndex(){
		return pageIndex;
	}

	public void setVersions(Object versions){
		this.versions = versions;
	}

	public Object getVersions(){
		return versions;
	}

	public void setCategories(Object categories){
		this.categories = categories;
	}

	public Object getCategories(){
		return categories;
	}

	public void setId(Object id){
		this.id = id;
	}

	public Object getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Films{" + 
			"pageTotal = '" + pageTotal + '\'' + 
			",dynamicLead = '" + dynamicLead + '\'' + 
			",film = '" + film + '\'' + 
			",nextOffset = '" + nextOffset + '\'' + 
			",title = '" + title + '\'' + 
			",search_string = '" + searchString + '\'' + 
			",previosOffset = '" + previosOffset + '\'' + 
			",version = '" + version + '\'' + 
			",total = '" + total + '\'' + 
			",pageIndex = '" + pageIndex + '\'' + 
			",versions = '" + versions + '\'' + 
			",categories = '" + categories + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}