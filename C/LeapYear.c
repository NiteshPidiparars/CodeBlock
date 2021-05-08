#include<stdio.h>
#include<conio.h>
int main()
{
    int year;
    printf("Enter a number : ");
    scanf("%d",&year);
    if(year%4)
        printf("Not a Leap Year");
    else if(year%100)
        printf("Leap Year");
    else if(year%400)
        printf("Not a Leap Year");
    else
        printf("Leap Year");
    getch();
}
/* int main()
{
    int year;
    printf("Enter a number : ");
    scanf("%d",&year);
    if(year%100 == 0){
        if(year%400 == 0)
            printf("Leap Year");
        else
            printf("Not a Leap Year");
    }else{
        if(year%4 == 0)
            printf("Leap Year");
        else
            printf("Not a Leap Year");
    }
    getch();
} */
