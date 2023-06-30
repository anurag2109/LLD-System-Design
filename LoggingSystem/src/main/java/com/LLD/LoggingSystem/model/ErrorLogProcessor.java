package com.LLD.LoggingSystem.model;

public class ErrorLogProcessor extends LogProcessor {

	public ErrorLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
		// TODO Auto-generated constructor stub
	}
	
	public void log(int logLevel, String message) {
		if(logLevel == ERROR) {
			System.out.println("ERROR: "+message);
		}else {
			super.log(logLevel, message);
		}
	}

}
