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
public class User2 extends Participent{
    private String name;
    private ApnaChatRoom chat;
    @Override
    public void sendMsg(String msg) {
        this.chat.showMsg(msg, this);
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    public User2(ApnaChatRoom chat){
        this.chat = chat;
    }
}
