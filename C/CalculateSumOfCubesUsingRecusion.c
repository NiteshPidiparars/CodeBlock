#include<stdio.h>
#include<conio.h>
int main()
{
    printf("Sum of Cubes is %d",SumCubes(3));
    getch();
}
int SumCubes(int n)
{
    if(n==1)
        return(1);
    return(n*n*n+SumCubes(n-1));
}
