#include<windows.h>
#include<stdio.h>
int main()
{
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),BACKGROUND_BLUE|BACKGROUND_RED);
    printf("\n\nBackground color change");
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),BACKGROUND_RED);
    printf("\n\nBackground color change");
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),BACKGROUND_INTENSITY);
    printf("\n\nBackground color change");
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),BACKGROUND_RED);
    printf("\n\nBackground color change");
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),BACKGROUND_BLUE);
    printf("\n\nBackground color change");
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE),BACKGROUND_RED|BACKGROUND_INTENSITY);
    printf("\n\nBackground color change");
    getch();
    return;
}
