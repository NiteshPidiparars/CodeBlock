#include<stdio.h>
struct TIME
{
    int second;
    int minutes;
    int hour;
};
void Difference(struct TIME t1,struct TIME t2,struct TIME *diff);
int main()
{
    struct TIME t1,t2,diff;
    printf("Enter Start time: \n");
    printf("Enter the hour,minutes and seconds: \n");
    scanf("%d%d%d",&t1.hour,&t1.minutes,&t1.second);
    printf("Enter Stop time: \n");
    printf("Enter the hour,minutes and seconds: \n");
    scanf("%d%d%d",&t2.hour,&t2.minutes,&t2.second);
    Difference(t1,t2,&diff);
    printf("Time Difference: %d:%d:%d- ",t1.hour,t1.minutes,t1.second);
    printf("%d:%d:%d",t2.hour,t2.minutes,t2.second);
    printf("= %d:%d:%d\n",diff.hour,diff.minutes,diff.second);
    return 0;
}
void Difference(struct TIME t1,struct TIME t2,struct TIME *diff)
{
    if(t2.second>t1.second){
        --t1.minutes;
        t1.second+=60;
    }
    diff->second=t1.second-t2.second;
    if(t2.minutes>t1.minutes){
        --t1.hour;
        t1.minutes+=60;
    }
    diff->minutes=t1.minutes-t2.minutes;
    diff->hour=t1.hour-t2.hour;
}
