#include<stdio.h>
#include<conio.h>
int main()
{
    int n,i,p=1;
    printf("Enter a number : ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
        p = p*i;
    printf("Product is : %d",p);
    getch();
}
