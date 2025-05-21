package com.lucascardeoli.artlist.dto;

import com.lucascardeoli.artlist.entities.Art;

public class ArtMinDTO {
	private long id;
	private String title;
	private String imgUrl;
	private String shortDescription;
	
	public ArtMinDTO() {
		
	}

	public ArtMinDTO(Art entity) {
		super();
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	

}
