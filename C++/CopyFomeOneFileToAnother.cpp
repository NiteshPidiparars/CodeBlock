#include<iostream>
#include<fstream>
#include<conio.h>
using namespace std;
void copyFile(char *f1, char *f2);
int main()
{
    copyFile("abc.txt","abccopy.txt");
    cout<<"File Copy is Completed";
    getch();
}
void copyFile(char *f1, char *f2)
{
    ifstream fin;
    ofstream fout;
    char ch;
    fin.open(f1);
    fout.open(f2);
    ch = fin.get();
    while(!fin.eof()){
        fout<<ch;
        ch=fin.get();
    }
    fin.close();
    fout.close();
}
