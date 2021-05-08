#include<stdio.h>
int main()
{
        int i=4, j=8;
        printf("%d, %d, %d\n", i|j&j|i, i|j&j|i, i^j);
        return 0;
}

/*
    Select one:
    a. 12, 12, 12 --> TRUE
    b. 112, 1, 12
    c. 32, 1, 12
    d. -64, 1, 12
    e. None of these    */
