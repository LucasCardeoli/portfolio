package com.lucascardeoli.artlist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Art")

public class Art {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String title;
		private String genre;
		private String imgUrl;
		@Column(columnDefinition = "TEXT")
		private String shortDescription;
		@Column(columnDefinition = "TEXT")
		private String longDescription;
		
		
		public Art() {
			
		}


		public Art(long id, String title, String genre, String imgUrl, String shortDescription,
				String longDescription) {
			super();
			this.id = id;
			this.title = title;
			this.genre = genre;
			this.imgUrl = imgUrl;
			this.shortDescription = shortDescription;
			this.longDescription = longDescription;
		}


		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getGenre() {
			return genre;
		}


		public void setGenre(String genre) {
			this.genre = genre;
		}


		public String getImgUrl() {
			return imgUrl;
		}


		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}


		public String getShortDescription() {
			return shortDescription;
		}


		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}


		public String getLongDescription() {
			return longDescription;
		}


		public void setLongDescription(String longDescription) {
			this.longDescription = longDescription;
		}


		@Override
		public int hashCode() {
			return Objects.hash(id);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Art other = (Art) obj;
			return id == other.id;
		}
		
		
}
