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
public class MenuOptions{
    private final ActionListenerCommond openCommond;
    private final ActionListenerCommond saveCommond;
    public MenuOptions(ActionListenerCommond openCommond, ActionListenerCommond saveCommond) {
        this.openCommond = openCommond;
        this.saveCommond = saveCommond;
    }
    public void clickOpen(){
        System.out.println("Click Document Open.");
    }
    public void clickSave(){
        System.out.println("Click Document Save.");
    }
}
