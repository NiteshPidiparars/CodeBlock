/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern;

/**
 *
 * @author hp
 */
public class IteratorPatternClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CollectionOfName cmpyRepository = new CollectionOfName();
        for(Iterator itr = cmpyRepository.getIterator();itr.hasNext();){
            String name = (String) itr.next();
            System.out.println("Name : "+name);
        }
    }
}
