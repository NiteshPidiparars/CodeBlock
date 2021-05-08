#include<iostream>
using namespace std;
class Area
{
private :
    int length;
    int breadth;
public :
    //Constructor with one argument
    Area():length(5),breadth(2){}
    //Constructor with two argument
    Area(int l,int b):length(l),breadth(b){}
    void GetLengthBreadth()
    {
        cout<<"Enter the Length and Breadth of Area: ";
        cin>>length>>breadth;
    }
    int AreaCalculation()
    {
        return(length*breadth);
    }
    void DisplayArea(int temp)
    {
        cout<<"Area is: "<<temp<<endl;
    }
};
int main()
{
    Area a1,a2(24,3);
    int temp;
    a1.GetLengthBreadth();
    cout<<"Area when default constructor called :";
    temp=a1.AreaCalculation();
    a1.DisplayArea(temp);
    cout<<"Area when Parametrized constructor called :";
    temp=a2.AreaCalculation();
    a2.DisplayArea(temp);
}
