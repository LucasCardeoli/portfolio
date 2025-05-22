package com.lucascardeoli.artlist.dto;

import org.springframework.beans.BeanUtils;

import com.lucascardeoli.artlist.entities.Art;

public class ArtDTO {
	private long id;
	private String title;
	private String genre;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public ArtDTO() {
		
	}
	
	public ArtDTO(Art entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
}
