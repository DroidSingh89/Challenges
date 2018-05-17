package com.example.user.viewlift_challenge.model;

import com.google.gson.annotations.SerializedName;

public class ImageItem{

	@SerializedName("src")
	private String src;

	@SerializedName("rokuSrc")
	private Object rokuSrc;

	@SerializedName("width")
	private Object width;

	@SerializedName("type")
	private String type;

	@SerializedName("height")
	private Object height;

	public void setSrc(String src){
		this.src = src;
	}

	public String getSrc(){
		return src;
	}

	public void setRokuSrc(Object rokuSrc){
		this.rokuSrc = rokuSrc;
	}

	public Object getRokuSrc(){
		return rokuSrc;
	}

	public void setWidth(Object width){
		this.width = width;
	}

	public Object getWidth(){
		return width;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setHeight(Object height){
		this.height = height;
	}

	public Object getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"ImageItem{" + 
			"src = '" + src + '\'' + 
			",rokuSrc = '" + rokuSrc + '\'' + 
			",width = '" + width + '\'' + 
			",type = '" + type + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}