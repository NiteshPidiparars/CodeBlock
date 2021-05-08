#include<stdio.h>
#include<conio.h>
char* inputString()
{
    char *p,*q,ch;
    int i,len=1;
    p=(char*)malloc(len);
    ch=getche();
    *p=ch;
    do
    {
        q=(char*)malloc(len+1);
        for(i=0; i<len; i++)
            *(q+i)=*(p+i);
        *(q+i)='\0';
        free(p);
        len++;
        p=(char*)malloc(len);
        for(i=0; i<len; i++)
            *(p+i)=*(q+i);
        free(q);
        ch=getche();
        *(p+len-1)=ch;
    }
    while(ch!=13);
    q=(char*)malloc(len);
    for(i=0; i<len; i++)
        *(q+i)=*(p+i);
    *(q+i-1)='\0';
    return(q);
}
main()
{
    char *str;
    str=inputString();
    printf("you have entered : %s",str);
    getch();
}
