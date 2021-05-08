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
public class CollectionOfName implements Container{
    public String Name[] = {"Ashwani Rajput", "Soono Jaiswal","Rishi Kumar","Rahul Mehta","Hemant Mishra"};
    @Override
    public Iterator getIterator() {
        return new CollectionOfNameIterate();
    }
    public class CollectionOfNameIterate implements Iterator{
        int i;
        public boolean hasNext(){
            if(i<Name.length){
                return true;
            }
            return false;
        }
        public Object next(){
            if(this.hasNext()){
                return Name[i++];
            }
            return null;
        }
    }
}
