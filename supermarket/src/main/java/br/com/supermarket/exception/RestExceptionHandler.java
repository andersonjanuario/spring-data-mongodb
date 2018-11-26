package br.com.supermarket.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(CategoryBadRequestException.class)
	public final ResponseEntity<Object> handleOrderBadRequest(CategoryBadRequestException ex) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(new ExceptionResponse(Errors.BAD_REQUEST.name(), ex.getMessage()));
	}

	@ExceptionHandler(ItemBadRequestException.class)
	public final ResponseEntity<Object> handleOrderBadRequest(ItemBadRequestException ex) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(new ExceptionResponse(Errors.BAD_REQUEST.name(), ex.getMessage()));
	}

	@ExceptionHandler(SuperMarketBadRequestException.class)
	public final ResponseEntity<Object> handleOrderBadRequest(SuperMarketBadRequestException ex) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(new ExceptionResponse(Errors.BAD_REQUEST.name(), ex.getMessage()));
	}

	@ExceptionHandler(PurchaseBadRequestException.class)
	public final ResponseEntity<Object> handleOrderBadRequest(PurchaseBadRequestException ex) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(new ExceptionResponse(Errors.BAD_REQUEST.name(), ex.getMessage()));
	}

}