package com.LLD.LogginSystem.model;

public class Debug extends LogProcessor {

	public Debug(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}
	
	public void log(int logId, String msg) {
		if(logId == DEBUG) {
			System.out.println("Debug: "+msg);
		}else {
			super.log(logId, msg);
		}
	}

}
