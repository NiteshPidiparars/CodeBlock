#include<iostream>
#include<conio.h>
using namespace std;
int area(int side)
{
    return side*side;
}
int area(int l,int b)
{
    return l*b;
}
int main()
{
    int (*p1)(int);
    int (*p2)(int,int);
    p1=area;
    p2=area;
    cout<<"Address of area(int): "<<p1;
    cout<<"\nAddress of area(int,int): "<<p2;
    cout<<"\nInvoking of area(int): "<<p1(20);
    cout<<"\nInvoking of area(int,int): "<<p2(20,30);
    return 0;
}
