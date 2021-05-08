#include<stdio.h>
#include<conio.h>/*
int main()
{
    int a,b,c,k;
    printf("Enter 3 number : ");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b && a>c)
        k = a;
    else{
        if(b>a && b>c)
            k = b;
        if(c>a && c>b)
            k = c;
    }
    printf("Greatest number is : %d",k);
    getch();
}*/
int main()
{
    int a,b,c,k;
    printf("Enter 3 number : ");
    scanf("%d%d%d",&a,&b,&c);
    k = a>b?a>c?a:c : b>c?b:c;
    printf("Greatest number is : %d",k);
    getch();
}
