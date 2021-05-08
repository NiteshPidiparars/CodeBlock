#include<iostream>
using namespace std;
class B;//formal declaration
class A
{
private :
    int a;
public :
    void setData(int x)
    {
        a=x;
    }
    void showData()
    {
        cout<<"a= "<<a<<endl;
    }
    friend void fun(A,B);
};
class B
{
private :
    int b;
public :
    void setData(int y)
    {
        b=y;
    }
    void showData()
    {
        cout<<"b= "<<b<<endl;
    }
    friend void fun(A,B);
};
void fun(A o1,B o2)
{
    cout<<"Sum is: "<<o1.a+o2.b<<endl;
}
int main()
{
    A o1;
    B o2;
    o1.setData(3);
    o2.setData(2);
    fun(o1,o2);
    return 0;
}
