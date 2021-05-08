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
public class Sales implements Connection{
    @Override
    public void open() {
        System.out.println("open database for sales");
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
        System.out.println("sales has beem update");
    }
}
