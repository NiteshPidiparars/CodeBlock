#include<iostream>
using namespace std;
class Prime
{
    int k,i,num;
public :Prime(int x)
    {
        num=x;
    }
    void check()
    {
        k=1;
      {
        for(i=2;i<=num/2;i++){
            if(num%i==0)
            {
                k=0;
                break;
            }
            else{
                k=1;
            }
            }
        }
    }
    void show()
    {
        if(k==1){
        cout<<num<<"is prime number";
    }
    else{
        cout<<num<<"is not prime number";
    }
    }
};
int main()
{
    int a;
    cout<<"Enter the number: ";
    cin>>a;
    Prime obj(a);
    obj.check();
    obj.show();
}
