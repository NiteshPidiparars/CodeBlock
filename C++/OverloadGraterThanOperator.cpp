#include<iostream>
#include<conio.h>
using namespace std;
class Time
{
private:
    int Hr,Min,Sec;
public:
    void setTime(int a,int b,int c)
    {
        Hr=a; Min=b; Sec=c;
    }
    void showTime()
    {
        cout<<"\n"<<Hr<<" : "<<Min<<" : "<<Sec;
    }
    int operator > (Time t)
    {
        if(Hr>t.Hr)
            return(1);
        else if(Hr<t.Hr)
            return(0);
        else if(Min>t.Min)
            return(1);
        else if(Min<t.Min)
            return(0);
        else if(Sec>t.Sec)
            return(1);
        else
            return(0);
    }
};
int main()
{
    Time t1,t2;
    t1.setTime(3,30,13);
    t2.setTime(3,15,10);
    if(t1>t2)
        t1.showTime();
    else
        t2.showTime();
    getch();
}
