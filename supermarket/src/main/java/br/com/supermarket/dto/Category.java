package br.com.supermarket.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Category implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2541466788915466125L;
	
	@Id
	private long id;
	
	private String name;
	
	private String description;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}