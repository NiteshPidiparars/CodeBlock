import java.util.*;
class MatrixMagic1
{
    static int n=3;
    static boolean isMagicSquare(int mm[][])
    {
        int sum=0;
        for(int i=0;i<n;i++)
            sum=sum+mm[i][i];
        for(int i=0;i<n;i++){
            int rowSum=0;
            for(int j=0;j<n;j++)
                rowSum+=mm[i][j];
            if(rowSum!=sum)
                return false;
        }
        for(int i=0;i<n;i++){
            int colSum=0;
            for(int j=0;j<n;j++)
                colSum+=mm[j][i];
            if(sum!=colSum)
                return false;
        }
        return true;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int[][] mm=new int[20][20];
        int n,m,i,j;
        System.out.println("Enter the rows and column: ");
        n=sc.nextInt();
        m=sc.nextInt();
        System.out.println("Enter the matrix: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                mm[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix are: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
              System.out.println(mm[i][j]+" ");
            }
        }
           if(isMagicSquare(mm))
                System.out.println("Magic Square");
           else
                System.out.println("Not Magic Matrix.");
    }
}
