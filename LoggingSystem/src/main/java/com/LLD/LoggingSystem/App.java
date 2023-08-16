package com.LLD.LoggingSystem;

import com.LLD.LoggingSystem.model.DebugLogProcessor;
import com.LLD.LoggingSystem.model.ErrorLogProcessor;
import com.LLD.LoggingSystem.model.InfoLogProcessor;
import com.LLD.LoggingSystem.model.LogProcessor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
    	logObject.log(LogProcessor.ERROR, "exceptions happens");
    	logObject.log(LogProcessor.DEBUG, "need to dubug");
    	logObject.log(LogProcessor.INFO, "Just for info");
    }
}
