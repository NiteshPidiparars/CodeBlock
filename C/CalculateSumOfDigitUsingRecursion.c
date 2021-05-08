#include<stdio.h>
#include<conio.h>
int main()
{
    int x;
    printf("Enter a number : ");
    scanf("%d",&x);
    printf("Sum is %d",sum(x));
    getch();
}
int sum(int x)
{
    if(x/10==0)
        return(x);
    return(x%10+sum(x/10));
}
