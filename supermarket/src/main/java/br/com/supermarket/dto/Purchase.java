package br.com.supermarket.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * The Class Purchase.
 */
@Data
@Document(collection = "purchase")
public class Purchase implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4134691762320231843L;

	@Id
	private String id;

	private Date date;

	private SuperMarket superMarket;

	private float totalPrice;

	private List<Item> items;	
	
}
