#include<stdio.h>
int main()
{
               struct emp
                {
                     char *n;
                     int age;
                };
             struct emp e1 = {"Dravid", 23};
             struct emp e2 = e1;
             strupr(e2.n);
             printf("%s\n", e1.n);
             return 0;
            }
/*
    Select one:
    a. Error: Invalid structure assignment --> TRUE
    b. DRAVID
    c. Dravid
    d. No output    */
