#include<stdio.h>
#include<conio.h>
int main()
{
    int x;
    for(x=0;x<=255;x++){
            if(x%24 == 0){
                getch();
                system("cls");
            }
        printf("\n %d %c",x,x);
    }
}
