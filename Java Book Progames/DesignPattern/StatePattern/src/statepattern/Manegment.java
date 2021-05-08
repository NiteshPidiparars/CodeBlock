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
public class Manegment implements Connection{
    @Override
    public void open() {
        System.out.println("open database for manegment");
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
        System.out.println("manegment has beem update");
    }
}
