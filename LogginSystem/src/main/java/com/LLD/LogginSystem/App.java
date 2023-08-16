package com.LLD.LogginSystem;

import com.LLD.LogginSystem.model.Debug;
import com.LLD.LogginSystem.model.ErrorLog;
import com.LLD.LogginSystem.model.InfoLog;
import com.LLD.LogginSystem.model.LogProcessor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LogProcessor logProcessor = new ErrorLog(new InfoLog(new Debug(null)));
        logProcessor.log(logProcessor.INFO, "Info Error");
        logProcessor.log(logProcessor.ERROR, "Error log");
        logProcessor.log(logProcessor.DEBUG, "Debug Error");
    }
}
