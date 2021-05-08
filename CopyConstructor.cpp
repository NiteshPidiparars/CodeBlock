#include<iostream>
using namespace std;
class point
{
private :
    int x;
    int y;
public :
    point(int x1,int y1)
    {
        x=x1;
        y=y1;
    }
    //copy constructor
    point(const point &p2)
    {
        x=p2.x;
        y=p2.y;
    }
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
};
int main()
{
    point a1(53,13);
    point a2=a1;
    cout<<"a1.x= "<<a1.getX()<<", a1.y= "<<a1.getY();
    cout<<"\na2.x= "<<a2.getX()<<", a2.y= "<<a2.getY()<<"\n";
}
