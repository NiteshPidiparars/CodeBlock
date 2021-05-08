/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author hp
 */
public class Accounting implements Connection{
    @Override
    public void open() {
        System.out.println("open database for accounting");
    }

    @Override
    public void close() {
        System.out.println("close the databases");
    }

    @Override
    public void log() {
        System.out.println("log activities");
    }

    public void update(){
        System.out.println("Account has beem update");
    }
}
