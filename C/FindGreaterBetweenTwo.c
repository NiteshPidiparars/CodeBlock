#include<stdio.h>
#include<conio.h>
int main()
{
    int a,b;
    printf("Enter two number : ");
    scanf("%d%d",&a,&b);
    if(a>b)
        printf("%d is Greater Number",a);
    else if(a<b)
        printf("%d is Greater Number",b);
    else
        printf("%d and %d are Equal",a,b);
    getch();
}
