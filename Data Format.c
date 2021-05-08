#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define MAX_BUF 50
int main()
{
    char buf[MAX_BUF];
    time_t seconds=time(NULL);
    struct tm *now=localtime(&seconds);
    const char *months[]={"January","February","March","May","June","July","August","September","October","November","December"};
    const char *days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    printf("%d-%d-%d\n",now->tm_year+1900,now->tm_mon+1,now->tm_mday);
    printf("%s %s %s\n",days[now->tm_wday],months[now->tm_mon],now->tm_mday,now->tm_year+1900);
    strftime(buf,MAX_BUF,"%A,%B%e,%Y",now);
    printf("%s\n",buf);
    return EXIT_SUCCESS;
}
