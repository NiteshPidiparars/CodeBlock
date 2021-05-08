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
public interface Connection {
    public void open();
    public void close();
    public void log();
    public void update();
}
