/* write a program to input name and percentage of 27 students of class is two separate one
   dimensional arrays. Arrange students details according to their percentage in the descending
   order using bubble sort method. display name and percentage of 10 worst performers of class? */
import java.util.*;
public class DemeritList
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n=27;
        String name[] = new String[n],tname;
        double percentage[] = new double[n],tpercentage;
        int i,j;
        System.out.println("Enter the name and percentage of the students : ");
        for(i=0;i<n;i++){
            name[i] = sc.nextLine();
            percentage[i] = Double.parseDouble(sc.nextLine());
        }
        for(i=1;i<n;i++){
            for(j=0;j<n-i;j++){
                if(percentage[j]<percentage[j+1]){
                    tname = name[j];
                    name[j] = name[j+1];
                    name[j+1] = tname;
                    tpercentage = percentage[j];
                    percentage[j] = percentage[j+1];
                    percentage[j+1] = tpercentage;
                }
            }
        }
        System.out.println("Details of 10 worst performer : ");
        System.out.println("Name\tPercentage");
        for(i=n-10;i<n;i++){
            System.out.println(name[i]+"\t"+percentage[i]);
        }
    }
}
