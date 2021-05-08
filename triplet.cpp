#include<iostream>
using namespace std;
void printFirstPythagoreanTriplet(int n)
{
    int ctr=0,sum=11;
    while(ctr!=n)
    {
        sum++;
        for(int i=3;i<=sum/3;i++){
            for(int j=i+1;j<=sum/2;j++){
                int k=sum-i-j;
                if(i*i+j*j==k*k){
                    cout<<i<<","<<j<<","<<k<<endl;
                    ctr++;
                }
                if(ctr==n)
                    break;
            }
            if(ctr==n)
                break;
        }
    }
}
void printFirstPythagoreanTriplet(int n);
int main()
{
    int n,l;
    cout<<"the pythagorean triplet are: ";
    n=printFirstPythagoreanTriplet(l);
    cout<<"the value are: "<<n<<endl;
    return 0;
}
