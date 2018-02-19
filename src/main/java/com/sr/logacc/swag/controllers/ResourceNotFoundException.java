package com.sr.logacc.swag.controllers;
/**
 * TODO Auto-generated Exception
 */
 public class ResourceNotFoundException extends Exception {
	 /**
	  * TODO Auto-generated Default Serial Version UID
	  */
	 private static final long serialVersionUID = 1L;    
	 
	 /**
	  * @see Exception#Exception()
	  */
	 public ResourceNotFoundException() {
		 super();
	 }
	 
	 /**
	  * @see Exception#Exception(String) 
	  */
	 public ResourceNotFoundException(String message) {
		 super(message);         
	 }
	 
	 /**
	  * @see Exception#Exception(Throwable)
	  */
	 public ResourceNotFoundException(Throwable cause) {
		 super(cause);           
	 }
	 
	 /**
	  * @see Exception#Exception(String, Throwable)
	  */
	 public ResourceNotFoundException(String message, Throwable cause) {
		 super(message, cause);
	 }
 }