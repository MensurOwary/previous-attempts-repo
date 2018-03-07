package com.owary.faora.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Entity
@Table(name="dream")
public class Dream {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="dream_id")
	private int id;
	
	@Column(name="dream_descr")
	private String description;
	
	@Column(name="dream_img_url")
	private String imgUrl;
	
	@Column(name="dream_title")
	private String title;
	
	@Transient
	private CommonsMultipartFile imageFile;
	
	
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
	
	

	public Dream(String description, String title, CommonsMultipartFile imageFile) {
		this.description = description;
		this.title = title;
		this.imageFile = imageFile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CommonsMultipartFile getImageFile() {
		return imageFile;
	}

	public void setImageFile(CommonsMultipartFile imageFile) {
		this.imageFile = imageFile;
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
