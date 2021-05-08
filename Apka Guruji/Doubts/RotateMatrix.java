/*
    Write a Java program to fill a matrix of size n*n with
    random number and then rotate it by 90 degree clockwise.
    Example : Input(m)=3
    1 2 3    7 4 1
    4 5 6 -> 8 5 2
    7 8 9    9 6 3
*/
import java.util.*;
public class RotateMatrix
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,r,c;
        long mat[][];
        System.out.println("Enter value of n : ");
        n = sc.nextInt();
        mat = new long[n][n];
        for(r=0;r<n;r++){
            for(c=0;c<n;c++){
                mat[r][c] = Math.round(Math.random()*n*n)+1;
            }
        }
        System.out.println("The Original Matrix is : ");
        for(r=0;r<n;r++){
            for(c=0;c<n;c++){
                System.out.print(mat[r][c]+"\t");
            }
            System.out.println();
        }
        System.out.println("The Matrix After Rotation is : ");
        for(c=0;c<n;c++){
            for(r=n-1;r>=0;r--){
                System.out.print(mat[r][c]+"\t");
            }
            System.out.println();
        }
    }
}
