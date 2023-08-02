package com.login.helper;

public class UserFoundException extends Exception{

	public UserFoundException() {
		super("User with this Username is already there in Db !! try with another one");
		// TODO Auto-generated constructor stub
	}

	public UserFoundException(String msg) {super(msg);}
	
	
}
