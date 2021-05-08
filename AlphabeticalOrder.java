import java.util.*;
public class AlphabeticalOrder
{
    public static void main(String[]args)
    {
      int n,i,j;
      String temp;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number that you want to entered name: ");
      n=sc.nextInt();
      String names[]=new String[n];
      Scanner sc1=new Scanner(System.in);
      System.out.println("Enter all name: ");
      for(i=0;i<n;i++){
        names[i]=sc1.nextLine();
      }
      for(i=0;i<n;i++){
        for(j=1+i;j<n;j++){
            if(names[i].compareTo(names[j])>0){
                temp=names[i];
                names[i]=names[j];
                names[j]=temp;
            }
        }
      }
      System.out.println("Sorted name are: ");
      for(i=0;i<n;i++){
        System.out.println(names[i]);
      }
    }
}
