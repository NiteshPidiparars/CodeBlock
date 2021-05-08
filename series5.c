#include<stdio.h>
int main()
{
    int n,i=1,f=1,sum=0;
    printf("Enter the number: \n");
    scanf("%d",&n);
    while(i<=n)
    {
            f=f*i;
        printf("%d ",f);
        sum=sum+(i*i)/f;
        i++;
    }
    printf("\nsum is: %d\n",sum);
    return 0;
}


