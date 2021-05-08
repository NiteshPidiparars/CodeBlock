#include<iostream>
using namespace std;
class Box
{
public :
    double getVolume(void)
    {
        return length*breadth*height;
    }
    void setLength(double ln)
    {
        length=ln;
    }
    void setBreadth(double br)
    {
        breadth=br;
    }
    void setHeight(double ht)
    {
        height=ht;
    }
    //Overloading +operator to add two Box objects
    Box operator+(const Box &b)
    {
        Box bx;
        bx.length=this->length+b.length;
        bx.breadth=this->breadth+b.breadth;
        bx.height=this->height+b.height;
        return bx;
    }
private:
    double length;//length of box
    double breadth;//breadth of box
    double height;//height of box
};
int main()
{
    Box b1;//declaration of b1 of type Box
    Box b2;//declaration of b2 of type Box
    Box b3;//declaration of b3 of type Box
    double volume=0.0;//store the volume of box
    b1.setLength(6.0);
    b1.setBreadth(7.0);
    b1.setHeight(5.0);
    b2.setLength(12.0);
    b2.setBreadth(13.0);
    b2.setHeight(20.0);
    volume=b1.getVolume();
    cout<<"Volume of Box1: "<<volume<<endl;
    volume=b2.getVolume();
    cout<<"\nVolume of Box2: "<<volume<<endl;
    b3=b1+b2;
    volume=b3.getVolume();
    cout<<"Volume of Box3: "<<volume<<endl;
    return 0;
}

