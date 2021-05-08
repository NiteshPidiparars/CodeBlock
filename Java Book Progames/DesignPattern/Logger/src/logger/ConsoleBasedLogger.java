/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

import java.awt.BorderLayout;

/**
 *
 * @author hp
 */
public class ConsoleBasedLogger extends Logger{
    public ConsoleBasedLogger(int level){
        this.level = level;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("CONSOLE LOGGER INFO : "+msg);
    }
}
