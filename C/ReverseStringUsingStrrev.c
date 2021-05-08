#include<stdio.h>
#include<string.h>
int main()
{
    char s[20];
    printf("Enter a String : ");
    gets(s); //s == &s[0];
    strrev(s);
    printf("Reverse a string : %s",s);
    getch();
}


