#include<iostream>
#include<conio.h>
using namespace std;
class Rectangle
{
private:
    int length, breath;
public:
    void setDimensions(int l,int b)
    {
        length=l; breath=b;
    }
    void showDimensions()
    {
        cout<<"\nLength and Breath of rectangle are "<<length<<" and "<<breath;
    }
    int getArea()
    {
        return(length*breath);
    }
    int getPerimeter()
    {
        return(2*(length+breath));
    }
};
int main()
{
    Rectangle r1,r2;
    r1.setDimensions(10,5);
    r2.setDimensions(20,10);
    cout<<"For First Rectangle";
    r1.showDimensions();
    cout<<"\nArea of rectangle is "<<r1.getArea();
    cout<<"\nPerimeter of rectangle is "<<r1.getPerimeter();
    cout<<"\n\nFor Second Rectangle";
    r2.showDimensions();
    cout<<"\nArea of rectangle is "<<r2.getArea();
    cout<<"\nPerimeter of rectangle is "<<r2.getPerimeter();
    getch();
}
