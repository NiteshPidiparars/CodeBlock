/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreterpattern;

/**
 *
 * @author hp
 */
public class InterpreterPatternClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String infix = "a+b*c";
        InfixToPosfixPattern ip = new InfixToPosfixPattern();
        String posfix = ip.conversion(infix);
        System.out.println("Infix : "+infix);
        System.out.println("Posfix : "+posfix);
    }
    
}
