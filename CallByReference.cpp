#include<iostream>
using namespace std;
int add(int *n1,int *n2);
int main()
{
    int n1=0,n2=0,output;
    cout<<"Enter the number: ";
    cin>>n1;
    cin>>n2;
    output=add(&n1,&n2);
    cout<<"Addition of "<<n1<<" + "<<n2<<"="<<output<<"\n";
    return 0;
}
int add(int *n1,int *n2)
{
    int result;
    result=*n1+*n2;
    return result;
}
