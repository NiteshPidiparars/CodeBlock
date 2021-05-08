#include<stdio.h>
#include<conio.h>
int main()
{
    char str[20];
    printf("Enter a string : ");
    gets(str);
    if(isPalindrome(str))
        printf("Palindrome");
    else
        printf("Not Palindrome");
    getch();
}
int isPalindrome(char s[])
{
    int i,l;
    l = strlen(s);
    for(i=0;i<l/2;i++){
        if(s[i] != s[l-1-i])
            return(0);
    }
    return(1);
}
