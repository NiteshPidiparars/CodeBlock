#include<stdio.h>
int main()
{
        int x, y, z;
        x=y=z=1;
        z = ++x || ++y && ++z;
        printf("x=%d, y=%d, z=%d\n", x, y, z);
        return 0;
}

/*
    Select one:
    a. x = 2, y = 1, z= 1 --> TRUE
    b. x = 2, y = 2, z= 1
    c. x = 2, y = 2, z= 2
    d. x = 1, y = 2, z= 1
    e. None of these    */
