#include<iostream>
using namespace std;
/*c++ program demonstrate the working of friend function*/
class Distance
{
private :
    int meter;
public :
    Distance():meter(0){}
    friend int func(Distance);//friend function
};
int func(Distance d)//function definition
{
    //accessing private data from on-member function
    d.meter=10;
    return d.meter;
}
int main()
{
    Distance D;//using ff
    cout<<"Distance: "<<func(D)<<"\n";
    return 0;
}
