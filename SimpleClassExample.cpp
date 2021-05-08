#include<iostream>
#include<math.h>
using namespace std;
class Point
{
    int x,y,z;
public :
    Point()
    {
        x=y=z=0;
    }
    Point(int i,int j,int k)
    {
        x=i;
        y=j;
        z=k;
    }
    Point(Point &a)
    {
        x=a.x;
        y=a.y;
        z=a.z;
    }
    Point negate()
    {
        x=-x;
        y=-y;
        z=-z;
    }
    void Print()
    {
        cout<<"("<<x<<","<<y<<","<<z<<")\n";
    }
    int norm()
    {
        return (sqrt(x*x+y*y+z*z));
    }
};
int main()
{
    Point p(2,3,4),p1(p);
    cout<<"The Point has the Coordinate\n";
    p.Print();
    cout<<"The Point Coordinate after negative\n";
    p.negate();
    p.Print();
    cout<<"The normal distance of the pointer from(0,0,0) is\n"<<p.norm()<<"\n";
    cout<<"The Coordinate of the Point p1 after copy constructor is\n";
    p1.Print();
    return 0;
}
