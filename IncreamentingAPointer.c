#include<stdio.h>
const int MAX=3;
int main()
{
    int var[]={10,100,200};
    int i,*ptr;
        ptr=var;
    for(i=MAX;i>0;i--){
        printf("Address of var[%d]= %d\n",i,ptr);
        printf("Value of var[%d]= %d\n",i,*ptr);
    ptr++;
    }
    return 0;
}


