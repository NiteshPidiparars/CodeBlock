#include<conio.h>
#include<iostream.h>
class Complex
{
private:
    int a,b;
public:
    void setData(int x,int y)
    {
        a=x; b=y;
    }
    void showData()
    {
        cout<<"\na= "<<a<<"b= "<<b;
    }
    Complex add(Complex c)
    {
        Complex temp;
        temp.a=a+c.a;
        temp.b=b+c.b;
        return(temp);
    }
};
    void main()
    {
        Complex c1,c2,c3;
        c1.setData(3,4);
        c2.setData(5,6);
        c3=c1.add(c2);
        c3.showData();
        getch();
}
