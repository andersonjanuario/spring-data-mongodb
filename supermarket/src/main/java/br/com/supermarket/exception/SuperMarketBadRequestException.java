package br.com.supermarket.exception;

public class SuperMarketBadRequestException extends RuntimeException {

	private static final long serialVersionUID = 5666257286084750956L;

	public SuperMarketBadRequestException() {
	}

	public SuperMarketBadRequestException(String message) {
		super(message);
	}

}
