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
		void showData()
		{
			cout<<"a: "<<a<<"\nb: "<<b<<"\n";
		}
		operator int()
		{
			return(a);
		}
};
int main()
{
	Complex c1;
	c1.setData(3,4);
	c1.showData();
	int x=5;
	x=c1;//x.complex(c1);
	cout<<"X: "<<x;
	getch();
}
