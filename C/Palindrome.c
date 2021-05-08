#include<stdio.h>
#include<conio.h>
int main()
{
    char str[20];
    int i,l;
    printf("Enter a string : ");
    gets(str);
    l = strlen(str);
    for(i=0;i<=l/2;i++){
        if(str[i] != str[l-1-i]){
            printf("Not a Palindrome");
            break;
        }
    }
    if(i == l/2)
        printf("Palindrome");
    getch();
}
