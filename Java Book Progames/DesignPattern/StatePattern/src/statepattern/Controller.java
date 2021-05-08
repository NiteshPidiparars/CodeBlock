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
public class Controller {
    public static Accounting acc;
    public static Sales sales;
    public static Manegment manegment;
    private static Connection con;
    Controller(){
        acc = new Accounting();
        sales = new Sales();
        manegment = new Manegment();
    }
    public void setAccountingConnection(){
        con = acc;
    }
    public void setSalesConnection(){
        con = sales;
    }
    public void setManegmentConnection(){
        con = manegment;
    }
    public void open(){
        con.open();
    }
    public void close(){
        con.close();
    }
    public void log(){
        con.log();
    }
    public void update(){
        con.update();
    }
}
