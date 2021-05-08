#include<stdio.h>
int r();
int main(){
    for(r();r();r()) {
        printf("%d ",r());
    }
    return 0;
}
int r(){
    int static num=7;
    return num--;
}
/*
    Select one:
    a. 6 5 4 3 2 1
    b. 5
    c. 5 2 --> TRUE
    d. 6 5 4
    e. None of these    */
