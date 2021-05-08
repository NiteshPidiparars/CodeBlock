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
public class StatePatternDemo {
        Controller controller;
        StatePatternDemo(String con){
            controller = new Controller();
            if(con.equalsIgnoreCase("manegment")){
                controller.setManegmentConnection();
            }
            if(con.equalsIgnoreCase("sales")){
                controller.setSalesConnection();
            }
            if(con.equalsIgnoreCase("accounting")){
                controller.setAccountingConnection();
            }
            controller.open();
            controller.close();
            controller.log();
            controller.update();
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic
            StatePatternDemo statePatternDemo = new StatePatternDemo(args[0]);
    }
}
