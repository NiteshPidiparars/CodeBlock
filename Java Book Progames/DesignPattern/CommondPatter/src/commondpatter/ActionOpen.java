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
public class ActionOpen implements ActionListenerCommond{
    private final Document doc;
    public ActionOpen(Document doc){
        this.doc = doc;
    }
    public void execute(){
        doc.open();
    }
}
