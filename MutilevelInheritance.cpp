#include<iostream>
#include<string.h>
using namespace std;
class Student
{
private :
    int rl;
    char nm[20];
public :
    void read();
    void display();
};
class Marks: public Student
{
protected :
    int s1;
    int s2;
    int s3;
public :
    void getMarks();
    void putMarks();
};
class result: public Marks
{
private :
    int t;
    int p;
    char div[10];
public :
    void process();
    void printResult();
};
void Student::read()
{
    cout<<"Enter RollNo: ";
    cin>>rl;
    cout<<"\nEnter Name: ";
    cin>>nm;
}
void Student::display()
{
    cout<<"\nEnter RollNo: ";
    cin>>rl;
    cout<<"\nEnter Name: ";
    cin>>nm;
    cout<<"\n";
}
void Marks::getMarks()
{
    cout<<"Enter marks for 3 student: ";
    cin>>s1>>s2>>s3;
}
void Marks::putMarks()
{
    cout<<"\nSubject1: "<<s1<<endl;
    cout<<"\nSubject2: "<<s2<<endl;
    cout<<"\nSubject3: "<<s3<<endl;
}
void result::process()
{
    t=s1+s2+s3;
    p=t/3.0;
    p>=60?strcpy(div,"First"):p>=50?strcpy(div,"Second"):strcpy(div,"Third");
}
void result::printResult()
{
    cout<<"\nTotal: "<<t<<endl;
    cout<<"\nPercentage: "<<p<<endl;
    cout<<"\nDevision: "<<div<<endl;
}
int main()
{
    result x;
    x.read();
    x.getMarks();
    x.process();
    x.display();
    x.putMarks();
    x.printResult();
    return 0;
}
