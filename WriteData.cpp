#include<iostream>
#include<conio.h>
#include<stdio.h>
#include<fstream>
using namespace std;
int main()
{
    ofstream fout;
    fout.open("myFile.txt");
    fout<<"hello";
    getch();
    fout.close();
    return 0;
}
