#include<iostream>
using namespace std;
class staticDemo
{
private :
    static int sum;
    int x;
public :
    staticDemo()
    {
        sum=sum+1;
        x=sum;
    }
    static void staticFunction()
    {
        cout<<"Result : "<<sum<<"\n";
    }
    void normalFunctionNumber()
    {
        cout<<"Number is: "<<x<<"\n";
    }
};
    int staticDemo::sum=0;
    int main()
    {
        cout<<"This is how the static method and variable works: \n";
        staticDemo stat;
        staticDemo::staticFunction();
        staticDemo stat1,stat2,stat3;
        stat1.normalFunctionNumber();
        stat2.normalFunctionNumber();
        stat3.normalFunctionNumber();
}
