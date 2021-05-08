#include<iostream>
using namespace std;
class A
{
public :
    int l;
    void len()
    {
        cout<<"length is: ";
        cin>>l;
    }
};
class B: public A
{
public :
    int b,c;
    void LintoB()
    {
        len();
        cout<<"Breadth is: ";
        cin>>b;
        c=l*b;
    }
};
class C
{
public :
    int h;
    void height()
    {
        cout<<"Height is: ";
        cin>>h;
    }
};
class D: public B,public C
{
public :
    int res;
    void result()
    {
        LintoB();
        height();
        res=h*c;
        cout<<"Result(l*b*h): "<<res<<"\n";
    }
};
int main()
{
    D obj;
    obj.result();
    return 0;
}
