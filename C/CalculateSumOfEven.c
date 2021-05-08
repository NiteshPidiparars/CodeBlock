#include<stdio.h>
#include<conio.h>
int main()
{
    int N,sum=0,i=2;
    printf("Enter a number : ");
    scanf("%d",&N);
    while(i<=N*2){
        sum = sum + i;
        i = i + 2;
    }
    printf("Sum is %d",sum);
    getch();
}
/* int main()
{
    int n,sum=0,i=1;
    printf("Enter a number : ");
    scanf("%d",&n);
    while(i<=n){
        sum = sum + i*2;
        i++;
    }
    printf("Sum is %d",sum);
    getch();
} */
