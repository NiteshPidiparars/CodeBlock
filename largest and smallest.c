#include<stdio.h>
int a,b;//Global variable declaration
int main()
{
    printf("Enter the two number if we check large and small number: \n");
    scanf("%d%d",&a,&b);
    if(a<b){
        printf("\nThe largest number is: %d",b);
        printf("\nThe smallest number is: %d",a);
    }
    else if(a==b){
        printf("Both are equal number %d and %d\n",a,b);
    }
    else {
        if(b<a){
        printf("The largest number is: %d",a);
        printf("The smallest number is: %d\n",b);
        }
    }
    return 0;
}
