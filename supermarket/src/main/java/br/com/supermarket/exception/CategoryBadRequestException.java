package br.com.supermarket.exception;

public class CategoryBadRequestException extends RuntimeException {

	private static final long serialVersionUID = -1055515665898155601L;

	public CategoryBadRequestException(){}
	
	public CategoryBadRequestException(String message){
		super(message);
	}
	
}
