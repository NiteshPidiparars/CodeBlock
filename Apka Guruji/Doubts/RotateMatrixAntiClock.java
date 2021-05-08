/*
    WAP to accept values in a 3*4 matrix and rotate it by
    90 degree anticlockwise.
    1   2   3   4       4   7   2
    3   4   6   7   =>  3   6   3
    6   5   3   2       2   4   5
                        1   3   6
*/
import java.util.*;
public class RotateMatrixAntiClock
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [3][4];
        int r,c;
        System.out.println("Enter the values : ");
        for(r=0;r<3;r++)
            for(c=0;c<4;c++)
                arr[r][c] = sc.nextInt();
        System.out.println("The Resulting Matrix is : ");
        for(c=3;c>=0;c--){
            for(r=0;r<3;r++)
                System.out.print(arr[r][c]+" ");
            System.out.println();
        }
    }
}
