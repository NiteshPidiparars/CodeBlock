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
public class DebugBasesLogger extends Logger{
    public DebugBasesLogger(int level){
        this.level = level;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("DEBUG LOGGER INFO : "+msg);
    }
}
