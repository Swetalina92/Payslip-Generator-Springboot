package com.work.demo.exception;

@SuppressWarnings("serial")
public class CustomExceptions extends Exception{
	public CustomExceptions(String errMsg) {
		super(errMsg);
	}
}
