#include<iostream>
#include<stdio.h>
int add(int a,int b);
using namespace std;
int main()
{
    int a,b,c;
    cout<<"Enter the number: ";
    cin>>a;
    cin>>b;
    c=add(a,b);
    cout<<"Addition of "<<a<<"+"<<b<<"="<<c<<"\n";
    return 0;
}
int add(int a,int b)
{
    int result;
    result=a+b;
    return result;
}
