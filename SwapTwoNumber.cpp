#include<iostream>
using namespace std;
void swap(int x,int y)
{
    int z;
    z=x;
    x=y;
    y=z;
    cout<<"Swapped value of a is: "<<x<<"\n";
    cout<<"Swapped value of b is: "<<y<<"\n";
}
int main(int argc,char *argv[])
{
    int a,b;
    cout<<"Enter two number: ";
    cin>>a>>b;
    cout<<"Original value of a and b are: "<<endl;
    cout<<"Value of a is: "<<a<<"\n";
    cout<<"Value of b is: "<<b<<"\n";
    swap(a,b);
    return 0;
}
