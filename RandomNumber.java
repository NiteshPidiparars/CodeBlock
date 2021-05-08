import java.util.*;
class RandomNumber
{
    public static void main(String[]args)
    {
        Random r=new Random();
        for(int i=0;i<9;i++){
        System.out.println(r.nextInt(1000));
        }
    }
}
