/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

/**
 *
 * @author hp
 */
public class ChainResponsibilityClient {

    /**
     * @param args the command line arguments
     */
    public static Logger doChaining() {
        // TODO code application logic here
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);
        Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
        consoleLogger.setNextLevelInfo(errorLogger);
        Logger debugLogger = new DebugBasesLogger(Logger.DEBUGINFO);
        errorLogger.setNextLevelInfo(debugLogger);
        return consoleLogger;
    }
    public static void main(String args[]){
        Logger chainLogger = doChaining();
        chainLogger.logMessage(Logger.OUTPUTINFO,"Enter the sequence of values.");
        chainLogger.logMessage(Logger.ERRORINFO, "An error is occure now.");
        chainLogger.logMessage(Logger.DEBUGINFO, "this was the error now debuging is completed.");
    }
}
