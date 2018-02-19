package com.sr.logacc.swag.controllers;

/**
 * TODO Auto-generated Exception
 */
 public class RoleNotFoundException extends Exception {
	 /**
	  * TODO Auto-generated Default Serial Version UID
	  */
	 private static final long serialVersionUID = 1L;    
	 
	 /**
	  * @see Exception#Exception()
	  */
	 public RoleNotFoundException() {
		 super();
	 }
	 
	 /**
	  * @see Exception#Exception(String) 
	  */
	 public RoleNotFoundException(String message) {
		 super(message);         
	 }
	 
	 /**
	  * @see Exception#Exception(Throwable)
	  */
	 public RoleNotFoundException(Throwable cause) {
		 super(cause);           
	 }
	 
	 /**
	  * @see Exception#Exception(String, Throwable)
	  */
	 public RoleNotFoundException(String message, Throwable cause) {
		 super(message, cause);
	 }
 }