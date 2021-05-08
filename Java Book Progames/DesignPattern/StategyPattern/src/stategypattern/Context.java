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
public class Context {
    public Stategy stategy;
    public Context(Stategy stategy){
        this.stategy = stategy;
    }
    public float executeStategy(float a,float b){
        return stategy.Calculation(a, b);
    }
}
