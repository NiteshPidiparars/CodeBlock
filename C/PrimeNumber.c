#include<stdio.h>
#include<conio.h>
int main()
{
    int x,i;
    printf("Enter a number : ");
    scanf("%d",&x);
    for(i=2; i<=x; i++)
        if(x%i==0)
            break;
    if(x==i)
        printf("%d is a Prime Number",x);
    else
        printf("%d is not Prime Number",x);
    getch();
}
