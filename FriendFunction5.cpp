#include<stdio.h>
#include<iostream>
using namespace std;
class Complex
{
private :
    int a,b;
public :
    void setData(int x,int y)
    {
        a=x;
        b=y;
    }
    void showData()
    {
        cout<<"a="<<a<<" b="<<b<<endl;
    }
    friend ostream& operator<<(ostream&,Complex);
    friend istream& operator>>(istream&,Complex);
};
ostream& operator<<(ostream &dout,Complex c)
{
    cout<<"\na= "<<c.a<<" b="<<c.b<<endl;
    return(dout);
}
istream& operator>>(istream &din,Complex &c)
{
    cin>>c.a>>c.b;
    return(din);
}
int main()
{
    Complex c1;
    cout<<"Enter the Complex number: ";
    cin>>c1;
    cout<<"You Entered: ";
    cout<<c1;
    return 0;
}
