#include<stdio.h>
int Prime_generator(int);
int isPrime(int);
int main()
{
    int result;
    while(result==Prime_generator(10));
    printf("%d ",result);
    getch();
}
int Prime_generator(int n)
{
    int x,num,j;
    static int *p=NULL,count,i;
    if(i==count-1){
        free(p);
        p=NULL;
        return (0);
    }
    if(p==NULL && n>0){
        p=(int*)malloc(sizeof(int)*n);
        num=n;
        count=n;
        x=2;
        j=0;
        while(num){
            if(isPrime(x)){
                p[j]=x;
                j++;
                num--;
            }
            x++;
        }
        return (p[i]);
    }
    if(n<=0){
        printf("Invalid Supply of data\n");
        return (0);
    }
    i++;
    return(p[i]);
}
int isPrime(int n)
{
    int i;
    for(i=2;i<n;i++)
        if(n%i==0)
        return 0;
    return 1;
}
