#include<stdio.h>
#include<conio.h>
int main()
{
    int i,k,flag=1;
    for(i=1,k=0;i<=7;i++){
        if(i<4-k)
            printf(" ");
        else{
            if(flag)
                printf("*");
            else
                printf(" ");
            flag = 1-flag;
        }
        if(i==4+k){
            k++;
            printf("\n");
            if(i==7)
                break;
            i=0;
            flag=1;
        }
    }
}
/* by user
int main()
{
    int i,k,flag=1,row;
    printf("Enter the number of rows : ");
    scanf("%d",&row);
    for(i=1,k=0;i<=2*row-1;i++){
        if(i<row-k)
            printf(" ");
        else{
            if(flag)
                printf("*");
            else
                printf(" ");
            flag = 1-flag;
        }
        if(i==row+k){
            k++;
            printf("\n");
            if(i==2*row-1)
                break;
            i=0;
            flag=1;
        }
    }
} */
