/*
    WAP in Java to accept a day number, year and
    find the date corresponding to that day in that year.
*/
import java.util.*;
public class DayNumberToDate
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int y,dn,rd,i;
        System.out.println("Enter the year, day Number : ");
        y = sc.nextInt();
        dn = sc.nextInt();
        if(dn<1||dn>366){
            System.out.println("Invalid day number.");
        }else{
            if(isLeapYear(y))
                days[1] = 29;
            rd = dn;
            for(i=0;i<11;i++){
                if(rd-days[i]<=0)
                    break;
                else
                    rd = rd - days[i];
            }
            System.out.println(rd+" "+months[i]+" "+y);
        }
    }
    static boolean isLeapYear(int y)
    {
        if(y%100 == 0)
            if(y%400 == 0)
            return true;
        else
            return false;
        else if(y%4 == 0)
            return true;
        else
            return false;
    }
}
