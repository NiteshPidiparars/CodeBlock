#include<stdio.h>
#include<conio.h>
int main()
{
    int N,x=2;
    printf("Enter a number : ");
    scanf("%d",&N);
    while(N){
        if(isPrime(x)){
            printf("%d ",x);
            N--;
        }
        x++;
    }
    getch();
}
int isPrime(int x)
{
    int i;
    for(i=2;i<x;i++)
        if(x%i==0)
        return(0);
    return(1);
}

/* int main()
{
    int N,x=2,i;
    printf("Enter a number : ");
    scanf("%d",&N);
    while(N){
        for(i=2;i<x;i++)
            if(x%i==0)
                break;
        if(i == x){
            printf("%d ",x);
            N--;
        }
        x++;
    }
    getch();
} */
