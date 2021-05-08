#include<conio.h>
#include<iostream>
using namespace std;
struct book
{
    int bookid;
    char title[20];
    float price;
    void input()
    {
        cout<<"Enter Bookid,tittle and price";
        cin>>bookid>>title>>price;
        if(bookid<0)
            bookid=-bookid;
    }
    void display()
    {
        cout<<"\n"<<bookid<<" "<<title<<" "<<price<<"\n";
    }
};
int main()
{
    book b1;
    b1.bookid=-100;
    b1.input();
    b1.display();
    getch();
}
