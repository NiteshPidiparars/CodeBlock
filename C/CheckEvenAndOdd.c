#include<stdio.h>
#include<conio.h>
int main()
{
    int n;
    printf("Enter a number : ");
    scanf("%d",&n);
    if(n%2==0)
    /* if(n/2) if(x/2*2==n)*/
    /* if(x & 1) print first odd */
        printf("Even");
    else
        printf("Odd");
    getch();
}
