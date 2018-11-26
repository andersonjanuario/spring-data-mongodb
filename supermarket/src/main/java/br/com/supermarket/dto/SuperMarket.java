package br.com.supermarket.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * The Class SuperMarket.
 */
@Data
@Document(collection = "superMarket")
public class SuperMarket implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5639214561419981230L;

	@Id
	private String id;

	private String name;

	private String country;

	private String image;
	
}
