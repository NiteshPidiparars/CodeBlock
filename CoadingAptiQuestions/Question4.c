#include<stdio.h>
int main()
{
     int i = 5;
    while(i-- >= 0)
          printf("%d,", i);
     i = 5;
     printf("\n");
     while(i-- >= 0)
           printf("%i,", i);
     while(i-- >= 0)
           printf("%d,", i);
      return 0;
}

/*
    Select one:
    a. 4, 3, 2, 1, 0, -1 4, 3, 2, 1, 0, -1 --> TRUE
    b. 5, 4, 3, 2, 1, 0 5, 4, 3, 2, 1, 0
    c. Error
    d. 5, 4, 3, 2, 1, 0 5, 4, 3, 2, 1, 0 5, 4, 3, 2, 1, 0
    e. None of these    */
