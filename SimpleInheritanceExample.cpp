#include<iostream>
using namespace std;
class Value
{
protected:
    int val;
public:
    void set_value(int a)
    {
        val=a;
    }
};
class Cube: public Value
{
public :
    int cube()
    {
        return (val*val*val);
    }
};
int main()
{
    Cube cb;
    cb.set_value(5);
    cout<<"The Cube of 5 is: "<<cb.cube()<<endl;
    return 0;
}
