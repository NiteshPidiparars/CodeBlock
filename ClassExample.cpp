#include<iostream>
using namespace std;
class Programming
{
private ://member variable and member function variable
    int variable;
public :
    void input_value()
    {
        cout<<"\nFunction input_value, Enter Integer number: "<<endl;
        cin>>variable;
    }
    void output_value()
    {
        cout<<"Variable entered is: ";
        cout<<variable<<"\n";
    }
};
int main()
{
    Programming ob;
    ob.input_value();
    ob.output_value();
    //ob.variable ; will produce an error because variable is private :
    return 0;
}

