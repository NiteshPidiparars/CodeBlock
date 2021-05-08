#include<stdio.h>
#include<conio.h>
int main()
{
    int n,i,sum=0;
    printf("Enter a number : ");
    scanf("%d",&n);
    for(i=0;i<=n;i++)
        sum = sum + i*i;
    printf("Sum is : %d",sum);
}
