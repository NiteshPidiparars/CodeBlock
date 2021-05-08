#include<conio.h>
#include<iostream>
using namespace std;
int main()
{
	int i;
	cout<<"Welcome";
	try{
		if(i==1)
		{
			throw 1;
		}
		if(i==2)
		{
			throw "Hello";
		}
		if(i==3)
		{
			throw 4.3;
		}
	}
	catch(int e)
	{
		cout<<"\nException no: "<<es;
	}
	cout<<"\nIn Last Line";
	getch();
}
