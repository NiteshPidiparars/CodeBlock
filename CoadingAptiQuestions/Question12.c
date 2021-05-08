#include<stdio.h>
   struct course
   {
       int courseno;
       char coursename[25];
   };
int main()
{
   struct course c[] = { {102, "Java"},
                         {103, "PHP"},
                         {104, "DotNet"}     };
   printf("%d ", c[1].courseno);
   printf("%s\n", (*(c+2)).coursename);
   return 0;
}
/*
    Select one:
    a. 103 DotNet --> TRUE
    b. 102 Java
    c. 103 PHP
    d. 104 DotNet
    e. None of these    */
