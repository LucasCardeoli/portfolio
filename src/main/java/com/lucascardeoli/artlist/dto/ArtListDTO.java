package com.lucascardeoli.artlist.dto;

import com.lucascardeoli.artlist.entities.ArtList;

public class ArtListDTO {

	private long id;
	private String title;

	
	public ArtListDTO() {
	}

	public ArtListDTO(ArtList entity) {
	
		id = entity.getId();
		title = entity.getName();
	
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	
}
