/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorpattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hp
 */
public class ApnaChatRoomImp implements ApnaChatRoom{
    DateFormat dateFormate = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");
    Date date = new Date();
    @Override
    public void showMsg(String msg, Participent p) {
       System.out.println(p.getName()+"gets message: "+msg);
       System.out.println("\t\t\t\t"+"["+dateFormate.format(date).toString()+"]");
    }   
}
