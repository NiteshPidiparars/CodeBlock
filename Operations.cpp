#include<iostream>
using namespace std;
class Operations
{
private :
    int n1,n2;
public :
    void add()
    {
        cout<<"Enter the two number: ";
        cin>>n1>>n2;
        cout<<"Addition is: "<<n1+n2;
        cout<<"\n";
    }
    void sub()
    {
        cout<<"Enter the two number: ";
        cin>>n1>>n2;
        cout<<"Subtraction is: "<<n1-n2;
        cout<<"\n";
    }
    void mul()
    {
        cout<<"Enter the two number: ";
        cin>>n1>>n2;
        cout<<"Multiplication is: "<<n1*n2;
        cout<<"\n";
    }
    void div()
    {
        cout<<"Enter the two number: ";
        cin>>n1>>n2;
        cout<<"Division is: "<<(float)n1/n2;
        cout<<"\n";
    }
};
int main()
{
    Operations op;
    op.add();
    op.sub();
    op.mul();
    op.div();
    return 0;
}
