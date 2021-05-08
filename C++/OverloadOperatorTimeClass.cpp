#include<iostream>
#include<conio.h>
using namespace std;
class Time
{
private:
    int HR,MIN,SEC;
public:
    void setTime(int h,int m,int s)
    {
        HR = h;
        MIN = m;
        SEC = s;
    }
    void showTime()
    {
        cout<<endl<<HR<<" : "<<MIN<<" : "<<SEC;
    }
    void normalize()
    {
        MIN = MIN+SEC/60;
        SEC=SEC%60;
        HR=HR+MIN/60;
        MIN=MIN%60;
    }
    Time operator +(Time t)
    {
        Time temp;
        temp.SEC = SEC + t.SEC;
        temp.MIN = MIN + t.MIN;
        temp.HR = HR + t.HR;
        temp.normalize();
        return(temp);
    }
};
int main()
{
    Time t1,t2,t3;
    t1.setTime(4,35,26);
    t2.setTime(3,50,45);
    t3 = t1+t2;//t3 = t1.operator+(t2)
    t1.showTime();
    t2.showTime();
    t3.showTime();
    getch();
}
