#include<iostream>
#include<math.h>
using namespace std;
int add(int n);
int main()
{
    int num;
    cout<<"Enter the number: ";
    cin>>num;
    cout<<"Sum of number is: "<<add(num)<<"\n";
    return 0;
}
int add(int n)
{
    if(n!=0){
        return n+add(n-1);
    }
}
