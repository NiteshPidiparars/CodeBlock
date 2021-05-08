#include<stdio.h>
#include<conio.h>
int main()
{
    int a[10],i,se=0,so=0;
    printf("Enter 10 Number : ");
    for(i=0; i<=9; i++)
        scanf("%d",&a[i]);
    for(i=0; i<=9; i++)
        if(a[i]%2==0)
            se = se + a[i];
        else
            so = so + a[i];
    printf("Sum of Even : %d\n", se);
    printf("Sum of Odd : %d", so);
    getch();
}
