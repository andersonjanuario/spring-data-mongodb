package br.com.supermarket.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

/**
 * The Class SuperMarket.
 */
public class SuperMarket implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5639214561419981230L;

	@Id
	private long id;

	private String name;

	private String country;

	private String image;

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
