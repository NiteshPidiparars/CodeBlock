#include<iostream>
using namespace std;
class Matrix
{
private:
    int a[3][3];
public:
    int& operator()(int i,int j)
    {
        return(a[i][j]);
    }
    void printMatrix()
    {
        int i,j;
        for(i=0; i<=2; i++)
        {
            for(j=0; j<=2; j++)
                cout<<a[i][j]<<"  ";
            cout<<"\n";
        }
    }
};
int main()
{
    Matrix m;
    m(0,0)=3;
    m(0,1)=4;
    m(0,2)=1;
    m(1,0)=3;
    m(1,1)=6;
    m(1,2)=0;
    m(2,0)=2;
    m(2,1)=4;
    m(2,2)=2;
    m.printMatrix();
}
