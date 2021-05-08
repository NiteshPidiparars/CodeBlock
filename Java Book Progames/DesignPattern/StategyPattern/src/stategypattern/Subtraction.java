/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stategypattern;

/**
 *
 * @author hp
 */
public class Subtraction implements Stategy{
    @Override
    public float Calculation(float a, float b) {
        return a*b;
    }
}
