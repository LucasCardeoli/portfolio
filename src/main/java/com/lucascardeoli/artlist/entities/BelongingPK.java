package com.lucascardeoli.artlist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
	
	
	@ManyToOne
	@JoinColumn(name="art_id")
	private Art art;
	@ManyToOne
	@JoinColumn(name="list_id")
	private ArtList list;
	
	public BelongingPK() {
		
	}

	public BelongingPK(Art art, ArtList list) {
		super();
		this.art = art;
		this.list = list;
	}

	public Art getArt() {
		return art;
	}

	public ArtList getList() {
		return list;
	}

	public void setArt(Art art) {
		this.art = art;
	}

	public void setList(ArtList list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(art, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(art, other.art) && Objects.equals(list, other.list);
	}
	
}
