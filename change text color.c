#include<windows.h>
#include<stdio.h>
void setColor(int ForgC);
int main()
{
    setColor(2);
    printf("color change : Nitesh");
    setColor(3);
    printf("\n\ncolor change : Nitesh");
    setColor(4);
    printf("\n\ncolor change : Nitesh");
    setColor(5);
    printf("\n\ncolor change : Nitesh");
    setColor(6);
    printf("\n\ncolor change : Nitesh");
    setColor(7);
    printf("\n\ncolor change : Nitesh");
    getch();
    return;
}
void setColor(int ForgC)
{
    WORD wColor;
    HANDLE hStdOut=GetStdHandle(STD_OUTPUT_HANDLE);
    CONSOLE_SCREEN_BUFFER_INFO csbi;
    if(GetConsoleScreenBufferInfo(hStdOut,&csbi))
    {
        wColor=(csbi.wAttributes & 0xF0) + (ForgC & 0x0F);
        SetConsoleTextAttribute(hStdOut,wColor);
    }
}
