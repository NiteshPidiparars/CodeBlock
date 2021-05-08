/*
    WAP to accept values in a 3*3 matrix and shift each row
    1 place upwards(top row should becomes bottom row).
    Example :
            3   4   5                2  3   4
    Input-> 2   3   4   =>  Output-> 1  2   3
            1   2   3                3  4   5
*/
import java.util.*;
public class ShiftRowUpwards
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int r,c,t;
        System.out.println("Enter the values : ");
        for(r=0;r<3;r++)
            for(c=0;c<3;c++)
                arr[r][c] = sc.nextInt();
        for(r=0;r<2;r++){
            for(c=0;c<3;c++){
                t = arr[r][c];
                arr[r][c] = arr[r+1][c];
                arr[r+1][c] = t;
            }
        }
        System.out.println("The Resulting Matrix is : ");
        for(r=0;r<3;r++){
            for(c=0;c<3;c++)
                System.out.print(arr[r][c]+" ");
            System.out.println();
        }
    }
}
