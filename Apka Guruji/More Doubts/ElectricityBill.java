/**/
import java.util.*;
public class ElectricityBill
{
    String monthName;
    int cno,pr,cr;
    double nb;
    ElectricityBill(String mn,int cn,int p,int c)
    {
        monthName = mn;
        cno = cn;
        pr = p;
        cr = c;
    }
    int computeUnitsConsumed()
    {
        return cr-pr;
    }
    double computeAmount()
    {
        int uc;
        uc = computeUnitsConsumed();
        if(uc<=100)
            return uc*0.9;
        else if(uc<=220)
            return 100*0.9 + (uc-100)*1.45;
        else
            return 100*0.9 + 120*1.45 + (uc-220)*2.25;
    }
    void computeNetBill()
    {
        Scanner sc = new Scanner(System.in);
        double cc = 100; //compulsory charge
        double amt = cc + computeAmount();
        double tax = amt*12/100;
        nb = amt + tax;
        boolean wib; //working in board
        System.out.println("works in board? (true/false) ");
        wib = sc.nextBoolean();
        if(wib)
            nb = nb - nb*3.5/100;
    }
    public void display()
    {
        System.out.println("Here is the billing information : ");
        System.out.println("Consumer Number : "+cno);
        System.out.println("Billing Month : "+monthName);
        System.out.println("Previous Reading : "+pr);
        System.out.println("Current Reading : "+cr);
        System.out.println("Net Bill : "+nb);
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int cn,pr,cr;
        String mn;
        System.out.println("Enter the month name, consumer number, Previous Reading, Current Reading : ");
        mn = sc.nextLine();
        cn = sc.nextInt();
        pr = sc.nextInt();
        cr = sc.nextInt();
        ElectricityBill ob = new ElectricityBill(mn,cn,pr,cr);
        ob.computeNetBill();
        ob.display();
    }
}
