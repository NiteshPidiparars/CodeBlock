import java.util.*;

class KeithNumber1

{

    public static void main(String args[])

    {

        Scanner sc = new Scanner(System.in);

        int n,nd,arr[],i,div,digit,s;

        System.out.println("Enter the number: ");

        n = sc.nextInt();

        nd = (n+"").length();

        arr = new int[nd+1];

        i=nd-1;

        for(div=n;div>0;div/=10)

        {

            digit = div%10;

            arr[i--]=digit;

        }

        while(arr[0]<n)

        {

            System.out.println(arr[0]);

            s=0;

            for(i=0;i<nd;i++)

            s += arr[i];

            arr[nd]=s;

            for(i=0;i<nd;i++)

            arr[i]=arr[i+1];

        }

        if(arr[0] == n)

        System.out.println("It is Keith number");

        else

        System.out.println("Not Keith Number.");

    }

}



