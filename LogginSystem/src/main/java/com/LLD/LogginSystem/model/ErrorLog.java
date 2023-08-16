package com.LLD.LogginSystem.model;

public class ErrorLog extends LogProcessor {

	public ErrorLog(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}
	
	public void log(int logId, String msg) {
		if(logId == ERROR) {
			System.out.println("Error: "+ msg);
		}else {
			super.log(logId, msg);
		}
	}

}
