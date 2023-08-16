package com.LLD.LogginSystem.model;

public abstract class LogProcessor {

	public static int INFO = 1;
	public static int ERROR = 2;
	public static int DEBUG = 3;
	
	LogProcessor nextLogProcessor;
	public LogProcessor(LogProcessor nextLogProcessor) {
		this.nextLogProcessor = nextLogProcessor;
	}
	
	public void log(int logId, String msg) {
		if(this.nextLogProcessor != null) {
			nextLogProcessor.log(logId,msg);
		}else {
			System.out.println(msg);
		}
	}
	
}
