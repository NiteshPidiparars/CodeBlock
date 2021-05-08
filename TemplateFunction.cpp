#include<iostream>
using namespace std;
template<typename T>
inline T const &Max(T const &val1,T const &val2)
{
    return val1<val2?val1:val2;
}
int main()
{
    int n1=9;
    int n2=210;
    cout<<"Integer(n1,n2): "<<Max(n1,n2)<<"\n";
    double d1=1.5;
    double d2=210.84;
    cout<<"Double(d1,d2): "<<Max(d1,d2)<<"\n";
    string s1="Hello..";
    string s2="What is going on....";
    cout<<"String(s1,s2): "<<Max(s1,s2)<<"\n";
    return 0;
}
