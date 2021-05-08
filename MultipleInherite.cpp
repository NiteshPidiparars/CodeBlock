#include<iostream>
#include<conio.h>
using namespace std;
class Area
{
public :
    float area_calc(float l,float b)
    {
        return l*b;
    }
};
class Perimeter
{
public :
    float pri_calc(float l,float b)
    {
        return 2*(l+b);
    }
};
//Rectangle class is drive from Perimeter and Area
class Rectangle: private Area,private Perimeter
{
private :
    float length,breadth;
public :
    Rectangle():length(0.0),breadth(0.0){}
    void get_data()
    {
        cout<<"Enter the length: ";
        cin>>length;
        cout<<"Enter the breadth: ";
        cin>>breadth;
    }
        float area_calc()
        {
            //calls area..calc() of class Area and return it
            return Area::area_calc(length,breadth);
        }
        float pri_meter()
        {
            //calls area..pri() of class Area and return it
            return Perimeter::pri_calc(length,breadth);
        }
};
int main()
{
    Rectangle r;
    r.get_data();
    cout<<"Area: "<<r.area_calc();
    cout<<"\nPerimeter: "<<r.pri_meter();
    cout<<"\n";
    return 0;
}

