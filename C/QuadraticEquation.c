#include<stdio.h>
#include<conio.h>
int main()
{
    int a,b,c,D;
    float x,y;
    printf("Enter Coefficient of x^2,x and Constant terms : ");
    scanf("%d%d%d",&a,&b,&c);
    D = b*b-4*a*c;
    if(D<0)
        printf("Both Roots are Imaginary");
    if(D==0){
        printf("Both Roots are Equals\n");
        x = -b/(2*a);
        printf("Roots is %f\n",x);
    }
    if(D>0){
        printf("Roots are Real and Distinct");
        x = (-b+sqrt(D))/(2*a);
        y = (-b-sqrt(D))/(2*a);
        printf("\nRoots are : %f, %f",x,y);
    }
    getch();
}
