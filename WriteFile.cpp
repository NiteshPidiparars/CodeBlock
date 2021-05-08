#include<iostream>
#include<stdio.h>
#include<fstream>
using namespace std;
int main()
{
    char data[100];
    //open a file in read mode
    ofstream outfile;
    outfile.open("File.cpp");
    cout<<"Writing the content of the file";
    cout<<"Enter your name: ";
    cin.getline(data,1000);
    //write the data into the file
    outfile<<data<<endl;
    cout<<"Enter your age: ";
    cin>>data;
    cin.ignore();
    //again write input data into the file
    cout<<data<<endl;
    cout<<"Successfully inserted data into file: ";
    //close the opened file
    outfile.close();
    return 0;
}
