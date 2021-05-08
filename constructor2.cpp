#include<iostream>
#include<conio.h>
using namespace std;
class Complex
{
private :
    int a,b;
public :
    Complex(int x,int y)//Parameterized Constructor
    {
        a=x; b=y;
    }
    Complex(int k)//Parameterized Constructor
    {
        a=k;
    }
    Complex(){}//Default Constructor
    Complex(Complex &c)
    {
        a=c.a;
        b=c.b;
    }
};
int main()
{
    Complex c1(3,4),c2,c3(5);
    Complex c4(c1);
    getch();
}
