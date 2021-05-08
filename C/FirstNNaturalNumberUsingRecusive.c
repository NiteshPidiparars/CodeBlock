#include<stdio.h>
#include<conio.h>
void print(int);
int main()
{
    print(10);
    getch();
}
void print(int N)
{
    if(N>=1){
        print(N-1);
        printf("%d ",N);
    }
}
