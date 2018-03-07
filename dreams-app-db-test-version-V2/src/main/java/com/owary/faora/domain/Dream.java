package com.owary.faora.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dream")
public class Dream {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dream_id")
	private int id;
	
	@Column(name="dream_title")
	private String title;
	
	@Column(name="dream_img_url")
	private String imgUrl;
	
	@Column(name="dream_descr")
	private String description;
	
	public Dream() {}
	
	public Dream(String title, String imgUrl) {
		this.title = title;
		this.imgUrl = imgUrl;
	}

	public Dream(String title, String imgUrl, String description) {
		this.title = title;
		this.imgUrl = imgUrl;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Dream [title=" + title + ", imgUrl=" + imgUrl + ", description=" + description + "]";
	}
	
	
	
	

}
