/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorpattern;

/**
 *
 * @author hp
 */
public abstract class Participent {
    public abstract void sendMsg(String msg);
    public abstract void setName(String name);
    public abstract String getName();
}
