#include<iostream>
using namespace std;
class Base
{
public :
    virtual void show()=0;
};
class Derived: public Base
{
public:
    void show()
    {
        cout<<"Implementation of virtual function in derived class"<<endl;
    }
};
int main()
{
    Base *b;
    Derived d;
    b=&d;
    b->show();
    return 0;
}
