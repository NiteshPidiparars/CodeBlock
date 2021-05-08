#include<stdio.h>
#include<conio.h>
int main()
{
    int x,l,u,i;
    printf("Enter a number : ");
    scanf("%d%d",&l,&u);
    for(x=l+1; x<=u-1; x++)
    {
        for(i=2; i<=x; i++)
            if(x%i==0)
                break;
        if(i==x)
            printf("%d ",x);
    }
}
