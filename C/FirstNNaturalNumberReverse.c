#include<stdio.h>
#include<conio.h>
/* int main()
{
    int n,i;
    printf("Enter a number : ");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        printf("%d ",n+1-i);
    }
} */

int main()
{
    int n,i;
    printf("Enter a number : ");
    scanf("%d",&n);
    for(i=n;i>=1;i--)
        printf("%d ",i);
}
