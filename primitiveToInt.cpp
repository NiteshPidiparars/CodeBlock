#include<conio.h>
#include<iostream>
using namespace std;
class Complex
{
	private :
		int a,b;
	public :
		void setData(int x,int y)
		{
			a=x; b=y;
		}
		Complex()
		{}
		Complex(int k)
		{
			a=k; b=0;
		}
		void showData()
		{
			cout<<"a: "<<a<<"\nb: "<<b<<"\n";
		}
};
int main()
{
	Complex c1;
	int x=5;
	c1=x;//c1.complex(x);
	c1.showData();
	getch();
}
