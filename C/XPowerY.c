#include<stdio.h>
#include<conio.h>
int main()
{
    int x,y,p=1,i;
    printf("Enter a number and its power : ");
    scanf("%d%d",&x,&y);
    for(i=1;i<=y;i++)
        p = p * x;
    printf("Result is : %d",p);
    getch();
}
