#include<stdio.h>
#include<conio.h>
int BtoD(char s[]);
int main()
{
    printf("%d",BtoD("101101"));
    getch();
}
int BtoD(char s[])
{
    int i,d=0;
    for(i=0;s[i];i++){
        if(s[i]=='0')
            d = d*2 + 0;
        else
            d = d*2 + 1;
    }
    return(d);
}
