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
public class TamplatePatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        // TODO code application logic here
            /*Class c=Class.forName(args[0]);*/
	    Game game = new Chess();
            //game=(Game) c.newInstance();
	    game.play();
	    System.out.println();
            game = new Soccer();
	    game.play();
    }
    
}
