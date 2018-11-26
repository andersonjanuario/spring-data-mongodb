package br.com.supermarket.exception;

public class PurchaseBadRequestException extends RuntimeException {

	private static final long serialVersionUID = 3890220293902639348L;

	public PurchaseBadRequestException() {
	}

	public PurchaseBadRequestException(String message) {
		super(message);
	}

}
