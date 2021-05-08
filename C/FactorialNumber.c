#include<stdio.h>
#include<conio.h>
int main()
{
    int i,x,n,f=1;
    printf("Enter a number : ");
    scanf("%d",&n);
    x = n;
    while(n>=1){
        f = f * n;
        n--;
    }
    printf("Factorial of %d is %d",x,f);
    getch();
}
