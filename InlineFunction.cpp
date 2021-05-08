#include<iostream>
using namespace std;
inline int add(int n1,int n2)
{
    return n1+n2;
}
inline int sub(int n1,int n2)
{
    return n1-n2;
}
inline int mul(int n1,int n2)
{
    return n1*n2;
}
inline int div(int n1,int n2)
{
    return n1/n2;
}
inline int mod(int n1,int n2)
{
    return n1%n2;
}
int main()
{
    cout<<"Add(20,30): "<<add(20,30)<<"\n";
    cout<<"Sub(20,30): "<<sub(20,30)<<"\n";
    cout<<"Mul(20,30): "<<mul(20,30)<<"\n";
    cout<<"Div(20,30): "<<div(20,30)<<"\n";
    cout<<"Mod(20,30): "<<mod(20,30)<<"\n";
}
