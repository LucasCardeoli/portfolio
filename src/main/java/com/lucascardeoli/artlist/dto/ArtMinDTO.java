package com.lucascardeoli.artlist.dto;

import com.lucascardeoli.artlist.entities.Art;
import com.lucascardeoli.artlist.projections.ArtMinProjection;

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
	
	public ArtMinDTO(ArtMinProjection projection) {
		this.id = projection.getId();
		this.title = projection.getTitle();
		this.imgUrl = projection.getImgUrl();
		this.shortDescription = projection.getShortDescription();
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
