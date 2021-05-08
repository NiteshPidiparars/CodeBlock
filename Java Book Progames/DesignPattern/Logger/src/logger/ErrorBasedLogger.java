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
public class ErrorBasedLogger extends Logger{
    public ErrorBasedLogger(int level){
        this.level = level;
    }
    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("ERROR BASED LOGGER : "+msg);
    }
}
