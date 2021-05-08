#include<stdio.h>
#include<conio.h>
int main()
{
    int a,b,min,i;
    printf("Enter two number : ");
    scanf("%d%d",&a,&b);
    min = a<b?a:b;
    for(i=2;i<=min;i++){
        if(a%i==0 && b%i==0)
            break;
    }
    if(i == min+1)
        printf("%d and %d are Co-Prime",a,b);
    else
        printf("%d and %d are not Co-Prime",a,b);
    getch();
}
