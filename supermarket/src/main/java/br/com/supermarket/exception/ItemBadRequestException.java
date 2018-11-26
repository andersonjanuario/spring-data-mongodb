package br.com.supermarket.exception;

public class ItemBadRequestException extends RuntimeException {

	private static final long serialVersionUID = 6887080873644691937L;

	public ItemBadRequestException() {
	}

	public ItemBadRequestException(String message) {
		super(message);
	}

}
