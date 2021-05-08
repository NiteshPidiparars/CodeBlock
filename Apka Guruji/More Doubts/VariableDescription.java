/* How To Write Variable Description in
   programs involving functions */
import java.util.*;
public class VariableDescription//Student Class
{
    int roll;
    String name;
    int marks[] = new int[3];
    void input()
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the roll and name :  ");
        roll = Integer.parseInt(sc.nextLine());
        name = sc.nextLine();
        System.out.println("Enter the marks of three subjects : ");
        for(i=0;i<3;i++)
            marks[i] = sc.nextInt();
    }
    void display()
    {
        double avg = (marks[0] + marks[1] + marks[2])/3.0;
        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
        if(avg>=60)
            System.out.println("First Devision");
        else if(avg>=45)
            System.out.println("Second Devision");
        else if(avg>=30)
            System.out.println("Third Devision");
        else
            System.out.println("Fail");
    }
    public static void main(String[]args)
    {
        VariableDescription obj = new VariableDescription();
        obj.input();
        obj.display();
    }
}
