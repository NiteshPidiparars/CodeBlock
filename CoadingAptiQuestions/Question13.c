#include<stdio.h>
int main()
{
            enum days {MON=-1, TUE, WED=6, THU, FRI, SAT};
            printf("%d, %d, %d, %d, %d, %d\n", MON, TUE, WED, THU, FRI, SAT);
            return 0;
}
/*
    Select one:
    a. -1, 0, 1, 2, 3, 4
    b. -1, 2, 6, 3, 4, 5
    c. -1, 0, 6, 2, 3, 4
    d. -1, 0, 6, 7, 8, 9 --> TRUE
    e. None of these    */
