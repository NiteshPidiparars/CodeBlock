#include<stdio.h>
#define LEFT 0
#define RIGHT 1
void rotate_array(int a[],int n,int dir,int shift_count);
void display(int a[],int n);
int main()
{
    int a[]={10,20,30,40,50,60,70,80};
    display(a,8);
    rotate_array(a,8,LEFT,3);
    display(a,8);
}
void display(int a[],int n)
{
    int i;
    printf("\n");
    for(i=0;i<n;i++)
        printf(" %d",a[i]);
}
void rotate_array(int a[],int n,int dir,int shift_count)
{
    int i,temp;
    if(dir==RIGHT){
        while(shift_count){
            temp=a[n-1];
            for(i=n-1;i>=1;i--)
                a[i]=a[i-1];
                a[0]=temp;
                shift_count--;
            }
        }
        else{
            while(shift_count){
                temp=a[0];
                for(i=0;i<=n-2;i++)
                    a[i]=a[i+1];
                    a[n-1]=temp;
                    shift_count--;
        }
    }
}
