#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    int year;
    cout<<"Enter Year : ";
    cin>>year;
    if(year%400==0 || year%100!=0 && year%4==0)
        cout<<"Leap Year";
    else
        cout<<"Non Leap Year";
    getch();
}

