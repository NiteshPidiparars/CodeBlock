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
public class User1 extends Participent{
    private String name;
    private final ApnaChatRoom chat;
    @Override
    public void sendMsg(String msg) {
        chat.showMsg(msg, this);
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    public User1(ApnaChatRoom chat){
        this.chat = chat;
    }
}
