import java.util.*;
public class WageCalculationProblem
{
    double h,r,w;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of hours worked...");
        h = sc.nextDouble();
        System.out.println("Enter the rate per hour : ");
        r = sc.nextDouble();
    }
    void computer()
    {
        if(h<=35)
            w = h*r;
        else if(h<=60)
            w = 35*r + (h-35) * r*1.5;
        else if(h<=70)
            w = 35*r + 25*r*1.5 + (h-60)*r*2;
        else{
            w = 35*r + 25*r*1.5 + 10*r*2;
        }
    }
    void display()
    {
        System.out.println("Your weekly wages : "+w);
    }
    public static void main(String[]args)
    {
        WageCalculationProblem wcal = new WageCalculationProblem();
        wcal.input();
        wcal.computer();
        wcal.display();
    }
}
