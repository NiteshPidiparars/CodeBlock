#include<stdio.h>
int main(){
    char c=125;
    do
        printf("%d ",c);
    while(c++);
    return 0;
}
/*
    Select one:
    a. Infinite times 125, 126,127...............
    b. Syntax Error
    c. Finite Times 126,127,-128,-127,126 . . . . , 3, 2, 1, 0
    d. None of these --> TRUE
*/
