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
public class Chess extends Game{
    
    @Override
    public void initialize() {
        System.out.println("Chess Game Initialized! Start playing.");
    }

    @Override
    public void start() {
        System.out.println("Game Started. Welcome to in the chess game!");
    }

    @Override
    public void end() {
        System.out.println("Game Finished!");
    }
}
