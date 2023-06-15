package com.mycompany.calcengine.exceptions;

public class InvalidStatementException extends Exception {

	public InvalidStatementException(String message) {
		super(message);

	}

	public InvalidStatementException(String message, Exception ex) {
		super(message, ex);

	}

}
