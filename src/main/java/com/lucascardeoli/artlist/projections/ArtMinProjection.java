package com.lucascardeoli.artlist.projections;

public interface ArtMinProjection {
	Long getId();
	String getTitle();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}
