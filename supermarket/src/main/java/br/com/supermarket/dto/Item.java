package br.com.supermarket.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

/**
 * The Class Item.
 */
public class Item implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4456415423267134424L;

	@Id
	private long id;

	private String name;

	private Category category;

	private String brand;

	private float price;

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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
