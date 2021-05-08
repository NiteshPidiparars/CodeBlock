#include<Windows.h>
void main()
{
    SYSTEMTIME stime;
    GetSystemTime(&stime);
    printf("%d / %d / %d",stime.wDay, stime.wMonth, stime.wYear);
    getch();
}

/* ForTurbo
#include<dos.h>
main()
{
    struct date today;
    getdate(&today);
    printf("%d / %d / %d",today.da_day, today.da_mon, today.da_year);
    getch();
} */
