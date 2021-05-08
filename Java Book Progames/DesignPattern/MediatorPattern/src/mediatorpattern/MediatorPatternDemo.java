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
public class MediatorPatternDemo{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApnaChatRoom chat = new ApnaChatRoomImp();
        User1 u1 = new User1(chat);
        u1.setName("Ashwini Rajput");
        u1.sendMsg("Hi Ashwini! How are you..");
        User2 u2 = new User2(chat);
        u2.setName("Soono jaiswal");
        u2.sendMsg("I am fine.you tell?");
    }
}
