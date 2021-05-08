/*
    WAP in Java to traverse through a matrix in Spiral
    path.
        1   2   3
        8   9   4
        7   6   5
*/
import java.util.*;
public class SpiralMatrix
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int rows,columns;
        System.out.println("Enter the number of rows and columns : ");
        rows = sc.nextInt();
        columns = sc.nextInt();
        int mat[][] = new int[rows][columns];
        int i,r=0,c=0,rr=rows,cc=columns;
        int limit = Math.min(rows%2==0?rows-1:rows,columns%2==0?columns-1:columns)/2;
        int n=1;
        for(i=0;i<=limit;i++){
            for(c=i;c<cc;c++){
                mat[i][c] = n++;
            }
            c--;
            for(r=i+1;r<rr;r++){
                mat[r][c] = n++;
            }
            if(r!=i+1){
                r--;
                for(c--;c>=i;c--){
                    mat[r][c] = n++;
                }
                if(c!=cc-2){
                    c++;
                    for(r--;r>i;r--){
                        mat[r][c] = n++;
                    }
                }
            }
            rr--;
            cc--;
        }
        System.out.println("The Matrix is : ");
        for(r=0;r<rows;r++){
            for(c=0;c<columns;c++){
                System.out.print(mat[r][c]+"\t");
            }
            System.out.println();
        }
    }
}
