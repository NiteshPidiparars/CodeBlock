/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commondpatter;

/**
 *
 * @author hp
 */
public class CommondPatterClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Document doc = new Document();
        ActionListenerCommond clickOpen = new ActionOpen(doc);
        ActionListenerCommond clickSave = new ActionSave(doc);
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);
        menu.clickOpen();
        menu.clickSave();
    }   
}
