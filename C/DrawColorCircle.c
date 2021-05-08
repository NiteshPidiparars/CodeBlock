#include<graphics.h>
int main()
{
    int gd=0,gm;
    initgraph(&gd,&gm,"c:\\bgi");
    Circle(300,200,70);
    getch();
    closegraph();
}
