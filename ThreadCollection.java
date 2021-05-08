import java.lang.*;
import java.io.*;
class ThreadCollection implements Runnable{
   ThreadCollection tc=new ThreadCollection(1);
   public void run() {
     System.out.println("Running Thread " + tc.getMessage());
   }
   public void start() {
        start();
   }
}
