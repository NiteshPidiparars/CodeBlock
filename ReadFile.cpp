#include<iostream>
#include<stdio.h>
#include<fstream>
using namespace std;
int main()
{
    char data[100];
    //open a file in read mode
    ifstream infile;
    infile.open("File.cpp");
    cout<<"Reading content from the file";
    infile>>data;
    cout<<data<<endl;
    //Read the data from file and display it
    infile>>data;
    cout<<data<<endl;
    infile.close();
    return 0;
}
