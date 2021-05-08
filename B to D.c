//binary to Decimal
#include<math.h>
main()
{
    int i,bin,s=0;
    printf("Enter the binary number: ");
    scanf("%d",&bin);
    while(bin)
    {
        s=s+pow(2,i)*(bin%10);
        bin=bin/10;
            i++;
    }
    printf("Decimal equivalant is %d",s);
}
