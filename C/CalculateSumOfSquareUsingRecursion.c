#include<stdio.h>
#include<conio.h>
int main()
{
    int x;
    printf("Enter a number : ");
    scanf("%d",&x);
    printf("Sum of Square of Digit is %d",square(x));
    getch();
}
int square(int n)
{
    if(n/10==0)
        return(n*n);
    return((n%10)*(n%10)+square(n/10));
}
