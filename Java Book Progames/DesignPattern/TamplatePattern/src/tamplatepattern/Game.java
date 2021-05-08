/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamplatepattern;

/**
 *
 * @author hp
 */
public abstract class Game {
    public abstract void initialize();
    public abstract void start();
    public abstract void end();
    public final void play(){
        initialize();
        start();
        end();
    }
}
