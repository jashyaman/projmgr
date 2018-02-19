package com.sr.logacc.swag.exceptions;

/**
 * TODO Auto-generated Exception
 */
 public class UserNotFoundException extends Exception {
	 /**
	  * TODO Auto-generated Default Serial Version UID
	  */
	 private static final long serialVersionUID = 1L;    
	 
	 /**
	  * @see Exception#Exception()
	  */
	 public UserNotFoundException() {
		 super();
	 }
	 
	 /**
	  * @see Exception#Exception(String) 
	  */
	 public UserNotFoundException(String message) {
		 super(message);         
	 }
	 
	 /**
	  * @see Exception#Exception(Throwable)
	  */
	 public UserNotFoundException(Throwable cause) {
		 super(cause);           
	 }
	 
	 /**
	  * @see Exception#Exception(String, Throwable)
	  */
	 public UserNotFoundException(String message, Throwable cause) {
		 super(message, cause);
	 }
 }
	
