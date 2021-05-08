#include<stdio.h>
int main()
{
   int j=1;
   while(j <= 255)
   {
       printf("%c %d\n", j, j);
       j++;
   }
   return 0;
}
/*
    Select one:
    a. Infinite times
    b. 255 times --> TRUE
    c. 256 times
    d. 254 times
    e. None of these    */
