#include<windows.h>
#include<stdio.h>
void SetColor(int ForgC);
int main()
{
    setColor(26);
    printf("Color change: Programing Hub");
    setColor(36);
    printf("Color change: Programing Hub");
    setColor(46);
    printf("Color change: Programing Hub");
    setColor(56);
    printf("Color change: Programing Hub");
    setColor(66);
    printf("Color change: Programing Hub");
    setColor(76);
    printf("Color change: Programing Hub");
    getch();
    return 0;

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
