#include<stdio.h>
int main()
{
        int a=0, b=1, c=3;
        *((a) ? &b : &a) = a ? b : c;
        printf("%d, %d, %d\n", a, b, c);
        return 0;
}

/*
    Select one:
    a. 0, 1, 3
    b. 1, 2, 3
    c. 3, 1, 3 --> TRUE
    d. 1, 3, 1
    e. None of these    */
