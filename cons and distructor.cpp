#include<iostream>
using namespace std;
class CubeDemo
{
public ://member variable and member function variable
    int side;
    CubeDemo()//Constructor declaration
    {
        side=5;
    }
    ~CubeDemo()//Destructor declaration
    {
        cout<<"\nDestructor Called.....";
    }
};
int main()
{
    CubeDemo obj;//Object creation
    cout<<"";
    cout<<obj.side;
}
