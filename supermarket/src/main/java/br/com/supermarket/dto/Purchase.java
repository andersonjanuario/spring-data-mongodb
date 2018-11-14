package br.com.supermarket.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Purchase implements Serializable {

	private static final long serialVersionUID = 4134691762320231843L;
	@Id
	private long id;
	
	private Date date;
	
	private SuperMarket superMarket;
		
	private float totalPrice;
	
	private List<Item> items;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public SuperMarket getSuperMarket() {
		return superMarket;
	}

	public void setSuperMarket(SuperMarket superMarket) {
		this.superMarket = superMarket;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
