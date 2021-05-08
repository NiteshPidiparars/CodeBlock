#include<iostream>
#include<conio.h>
using namespace std;
class MinusOperatorOverloading
{
private :
    int x,y,z;
public :
    void get_data(int a,int b,int c)
    {
        x=a;
        y=b;
        z=c;
    }
    void operator-()
    {
        x=x-10;
        y=y-10;
        z=z-10;
    }
    void display()
    {
        cout<<"\nX: "<<x;
        cout<<"\nY: "<<y;
        cout<<"\nZ: "<<z;
    }
};
int main()
{
    MinusOperatorOverloading mn;
    mn.get_data(53,73,93);
    cout<<"Before Displaying: "<<endl;
    mn.display();
    -mn;
    cout<<"\n";
    cout<<"\nAfter Displaying: "<<endl;
    mn.display();
    cout<<"\n";
    return 0;
}
