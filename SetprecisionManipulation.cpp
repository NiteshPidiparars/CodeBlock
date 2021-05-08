#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    float n1,n2,result;
    n1=20;
    n2=3;
    result=n1/n2;
    //use while a displaying a float pointer
    cout<<setprecision(1)<<result<<endl;
    cout<<setprecision(2)<<result<<endl;
    cout<<setprecision(3)<<result<<endl;
    cout<<setprecision(4)<<result<<endl;
    return 0;
}
