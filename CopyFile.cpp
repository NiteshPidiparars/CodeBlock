#include<iostream>
#include<stdio.h>
#include<fstream>
using namespace std;
int main()
{
    //variable declaration
    ofstream outfile;
    ifstream infile;
    char f1[10],f2[10];
    char ch,uch;
    cout<<"Enter the file name to be copied: ";
    cin>>f1;
    cout<<"Enter new file name : ";
    cin>>f2;
    infile.open(f1);
    if(infile.fail()){
        cout<<"No Such a file exit ";
        return 0;
    }
    outfile.open(f2);
    if(outfile.fail()){
        cout<<"Unable to create file";
        return 0;
    }
    while(!infile.eof()){
        ch=(char)infile.get();
        uch=(char)toupper(ch);
        outfile.put(ch);
    }
    infile.close();
    outfile.close();
    return 0;
}
