package com.bean;

import org.springframework.stereotype.Component;

@Component("film")
public class Film {

	
	private String title;
	private String description;
	private int language_id;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}
	public Film() {
	}
	public Film(String title, String description, int language_id) {
		this.title = title;
		this.description = description;
		this.language_id = language_id;
	}
	
	
	
}
