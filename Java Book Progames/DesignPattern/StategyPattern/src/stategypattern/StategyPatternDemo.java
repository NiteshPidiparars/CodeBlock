/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stategypattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hp
 */
public class StategyPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First Number: ");
        float value1 = Float.parseFloat(bf.readLine());
        System.out.println("Enter Second Number: ");
        float value2 = Float.parseFloat(bf.readLine());
        Context context = new Context(new Addition());
        System.out.println("Addition : "+context.executeStategy(value1, value2));
        context = new Context(new Subtraction());
        System.out.println("Multiplication : "+context.executeStategy(value1, value2));
        context = new Context(new Multiplication());
        System.out.println("Subtraction : "+context.executeStategy(value1, value2));
    }
}
