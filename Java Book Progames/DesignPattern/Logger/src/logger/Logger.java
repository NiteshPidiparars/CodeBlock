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
public abstract class Logger {
    static final int OUTPUTINFO = 1;
    static final int ERRORINFO  = 2;
    static final int DEBUGINFO = 3;
    protected int level;
    protected Logger nextLevelLogger;
    public void setNextLevelInfo(Logger nextLevelLogger){
        this.nextLevelLogger = nextLevelLogger;
    }
    public void logMessage(int level,String msg){
        if(this.level<=level){
            displayLogInfo(msg);
        }
        if(nextLevelLogger!=null){
            nextLevelLogger.logMessage(level, msg);
        }
    }
    protected abstract void displayLogInfo(String msg);
}
