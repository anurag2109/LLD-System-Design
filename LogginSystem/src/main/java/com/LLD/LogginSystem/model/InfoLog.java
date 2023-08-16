package com.LLD.LogginSystem.model;

public class InfoLog extends LogProcessor {

	public InfoLog(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}
	
	public void log(int logId, String msg) {
		if(logId == INFO) {
			System.out.println("INFO: "+msg);
		}else {
			super.log(logId,msg);
		}
	}
}
